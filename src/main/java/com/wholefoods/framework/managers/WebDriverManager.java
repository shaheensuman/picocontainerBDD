package com.wholefoods.framework.managers;

import com.wholefoods.framework.enums.DriverType;
import com.wholefoods.framework.enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class WebDriverManager {
    private WebDriver driver;
    private  static DriverType driverType;
    private  static EnvironmentType environmentType;
    private  static  final  String Chrome_driver_property="webdriver.chrome.driver";
    private  static  final  String FireFox_driver_property="webdriver.gecko.driver";
    private  static final String ie_driver_property="webdriver.ie.driver";
    private  static  final String edge_driver_property="webdrive.edge.driver";
    public WebDriverManager() throws IOException {
       driverType=FileReaderManager.getFileReaderManager().getConfigFileReader().getBrowser();
       environmentType =FileReaderManager.getFileReaderManager().getConfigFileReader().getEnvironment();
    }

    public WebDriver getDriver() throws IOException {
        if(driver==null){
            driver=createDriver();
        }return driver;
    }
    private  WebDriver createDriver() throws IOException {
        switch (environmentType){
            case LOCAL: driver=createLocalDriver();
            break;
            case REMOTE: driver=createRemoteDriver();
            break;

        }return driver;
    }

    private  WebDriver createRemoteDriver(){
        throw  new RuntimeException(" Not yet set up");
    }

    private  WebDriver createLocalDriver() throws IOException {
        switch (driverType){
            case CHROME:
                System.setProperty(Chrome_driver_property,FileReaderManager.getFileReaderManager().getConfigFileReader().getDriverPath());
                driver=new ChromeDriver();
                break;
            case INTERNETEXPLORER:
                System.setProperty(ie_driver_property,FileReaderManager.getFileReaderManager().getConfigFileReader().getDriverPath());
                driver=new InternetExplorerDriver();
                break;
            case FIREFOX:
                System.setProperty(FireFox_driver_property,FileReaderManager.getFileReaderManager().getConfigFileReader().getDriverPath());
                driver =new FirefoxDriver();
                break;
            case EDGE:
                System.setProperty(edge_driver_property,FileReaderManager.getFileReaderManager().getConfigFileReader().getDriverPath());
                driver=new EdgeDriver();
                break;
        }return driver;
    }

    public void closeDriver(){
        driver.close();
        driver.quit();
    }
}
