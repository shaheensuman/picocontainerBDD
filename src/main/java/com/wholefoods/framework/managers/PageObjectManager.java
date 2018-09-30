package com.wholefoods.framework.managers;


import com.wholefoods.framework.pageObjects.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class PageObjectManager {
    private WebDriver driver;

    private HomePage homePage;

    private CustomerServicePage customerServicePage;
    private LocalSalesPage localSalesPage;
    private ShopOnlinePage shopOnlinePage;
    private StoreLocatorPage storeLocatorPage;
    private  RecipePage recipePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        if (homePage==null){
            homePage=new HomePage(driver);
        }
        return homePage;
    }
    public CustomerServicePage getCustomerServicePage(){
        return (customerServicePage==null)?customerServicePage=new CustomerServicePage(driver):customerServicePage;
    }

    public  RecipePage getRecipePage(){
        return (recipePage==null)?recipePage=new RecipePage(driver):recipePage;
    }
    public StoreLocatorPage getStoreLocatorPage(){
        return (storeLocatorPage==null)?storeLocatorPage=new StoreLocatorPage(driver):storeLocatorPage;
    }

    public  LocalSalesPage getLocalSalesPage(){
        if(localSalesPage==null){
            localSalesPage=new LocalSalesPage(driver);
        }
        return localSalesPage;
    }
    public ShopOnlinePage getShopOnlinePage(){
        if(shopOnlinePage==null){
            shopOnlinePage=new ShopOnlinePage(driver);
        }
        return shopOnlinePage;
    }

}
