package com.wholefoods.framework.dataProvider;

import com.wholefoods.framework.enums.DriverType;
import com.wholefoods.framework.enums.EnvironmentType;

import java.io.*;
import java.util.Properties;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class ConfigFileReader {
    private Properties properties;
    private  final String propertyFilePath="src//main//resources//configs//configuration.properties";

    public ConfigFileReader() throws IOException {

        InputStream inputStream=new FileInputStream(propertyFilePath);
        properties=new Properties();
        properties.load(inputStream);
        inputStream.close();
    }

    public String getDriverPath(){

        String path=properties.getProperty("driverPath");
        String driverPath ="src//main//resources//drivers//"+path+"driver.exe";
        if (driverPath!=null){
            return driverPath;
        }
        else throw new RuntimeException("Driver path is not specified in the configuration.properties file");
    }


    public Long getImplicitWait(){
        String implicitWait=properties.getProperty("implicitWait");
        if (implicitWait!=null){
            return Long.parseLong(implicitWait);
        }
        else throw new RuntimeException("implicit wait is not specified in the configuration.properties file");
    }
    public String getApplicationUrl(){

        String applicationUrl=properties.getProperty("url");
        if(applicationUrl.equalsIgnoreCase("FTF")){
            applicationUrl="https://www.wholefoodsmarket.com/";
        }else if(applicationUrl.equalsIgnoreCase("QAF")){
            applicationUrl="https://github.com/mozilla/geckodriver/releases";
        }else if(applicationUrl.equalsIgnoreCase("QAT")){
            applicationUrl="https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer/1.2.5";
        }
        if (applicationUrl!=null){
            return applicationUrl;
        }
        else throw new RuntimeException("Application Url is not specified in the configuration.properties file");
    }

    public DriverType getBrowser(){
        String browserName=properties.getProperty("browser");
        if(browserName==null||browserName.equalsIgnoreCase("chrome"))
            return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("ff"))
            return DriverType.FIREFOX;
        else if(browserName.equalsIgnoreCase("ie"))
            return DriverType.INTERNETEXPLORER;
        else if(browserName.equalsIgnoreCase("edge"))
            return DriverType.EDGE;
        else throw new RuntimeException("Browser Name key value in configuration.properties is not match");
    }

    public EnvironmentType getEnvironment(){
        String enviromentName=properties.getProperty("Environment");
        if(enviromentName==null||enviromentName.equalsIgnoreCase("Local"))
            return EnvironmentType.LOCAL;
        else if(enviromentName.equalsIgnoreCase("remote"))
            return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type kety value in configuration.properties is not match");
    }

    public Boolean getWindowSize(){
        String windowSize=System.getProperty("windowMaximize");
        if(windowSize!=null)
            return Boolean.valueOf(windowSize);
        return true;
    }
}
