package com.wholefoods.framework.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class LocalSalesPage extends PageBase {
    @FindBy(xpath = "//*[@id='edit-state']")
    protected WebElement stateLocationdropBox;

    @FindBy(xpath = "//*[@id='edit-store']")
    protected WebElement storedropBox;

    @FindBy(xpath = "//*[@id='store-select-submit']")
    protected WebElement viewStoreSalesButton;

    @FindBy(xpath = "//a[contains(text(),'Galleria')]")
    protected WebElement storeName;


    public LocalSalesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void user_navigate_to_local_sales_page() throws Throwable {
        String title=driver.getTitle();
        System.out.println(title);
    }

    public void user_click_on_select_user_location_dropbox() throws Throwable {
    stateLocationdropBox.click();
    }

    public void user_select_as_state(String state) throws Throwable {
        Select dropdown= new Select(stateLocationdropBox);
        dropdown.selectByVisibleText(state);
    }

    public void user_click_on_select_a_store_drop_box() throws Throwable {
            storedropBox.click();
    }

    public void user_select_as_store_location(String store) throws Throwable {
        Select dropdown= new Select(storedropBox);
        dropdown.selectByVisibleText(store);
    }

    public void user_click_on_view_store_button() throws Throwable {
        viewStoreSalesButton.click();
        Thread.sleep(5000);
    }

    public void user_verify_city_name_appare_at_the_top() throws Throwable {
            String name=storeName.getText();
        Assert.assertEquals("Galleria",name);
    }
}
