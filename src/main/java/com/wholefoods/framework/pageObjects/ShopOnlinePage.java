package com.wholefoods.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class ShopOnlinePage extends PageBase {

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement contactUsLink;
    public ShopOnlinePage() {
    }

    public ShopOnlinePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void user_click_on_contact_us_link() throws Throwable {
    contactUsLink.click();
    Thread.sleep(3000);
    }
}
