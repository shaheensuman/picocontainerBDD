package com.wholefoods.framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class HomePage extends  PageBase{

    @FindBy(xpath = "//a[contains(text(),'Local Sales')]")
    protected WebElement localsalesLink;

    @FindBy(xpath = "//a[contains(text(),'Customer Service')]")
    protected WebElement cuatomerServiceLink;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void user_navigate_wholefoods_page() throws Throwable {

    String title=driver.getTitle();
        System.out.println(title);

    }

    public void user_count_navbar_option() throws Throwable {
        List<WebElement> elements=driver.findElements(By.xpath("//*[@id='main-menu']//li"));
        int size=elements.size();
        System.out.println(" nav bar Size is: "+size);
    }
    public void user_click_on_localsales_link() throws Throwable {
        localsalesLink.click();
        Thread.sleep(5000);
    }

    public void user_click_on_customer_service_page() throws Throwable {
        cuatomerServiceLink.click();
        Thread.sleep(5000);
    }

}
