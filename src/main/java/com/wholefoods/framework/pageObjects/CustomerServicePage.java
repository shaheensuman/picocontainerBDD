package com.wholefoods.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class CustomerServicePage extends PageBase{



    @FindBy(xpath = "//a[contains(text(),'Check it out ')]")
    WebElement ckOutLink;

    @FindBy(xpath = "//*[@id='block-system-main']/div/div/div[1]/h2")
    WebElement faqtext;

    @FindBy(xpath = "//a[contains(text(),'Shop Online')]")
    WebElement shopOnlinelink;


    public CustomerServicePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void user_land_on_customer_service_page() throws Throwable {
        String title=driver.getTitle();
        System.out.println(title);
    }

    public void user_click_on_check_it_out_link() throws Throwable {
        ckOutLink.click();
        Thread.sleep(3000);
    }

    public void user_redirect_to_FAQ_page() throws Throwable {
        String faq=faqtext.getText();
        System.out.println(faq);
    }

    public void user_click_on_shop_online_page() throws Throwable {
        shopOnlinelink.click();
        Thread.sleep(5000);
    }

    public void user_redirect_to_customer_service_page() throws Throwable {

        String title=driver.getTitle();
        System.out.println(title);
    }
}
