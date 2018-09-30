package com.wholeFoods.scripts.stepDefination;

import com.wholefoods.framework.cucumberTestContext.TestContext;
import com.wholefoods.framework.pageObjects.CustomerServicePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class CustomerServicePageSteps {
 TestContext testContext;
 CustomerServicePage customerServicePage;

    public CustomerServicePageSteps(TestContext testContext) {
        this.testContext = testContext;
        customerServicePage=testContext.getPageObjectManager().getCustomerServicePage();

    }
    @Then("^user  land on customer service page$")
    public void user_land_on_customer_service_page() throws Throwable {
        customerServicePage.user_land_on_customer_service_page();
    }

    @When("^user click on check it out link$")
    public void user_click_on_check_it_out_link() throws Throwable {
        customerServicePage.user_click_on_check_it_out_link();
    }

    @Then("^user redirect to FAQ page$")
    public void user_redirect_to_FAQ_page() throws Throwable {
        customerServicePage.user_redirect_to_FAQ_page();
    }

    @When("^user click on shop online page$")
    public void user_click_on_shop_online_page() throws Throwable {
        customerServicePage.user_click_on_shop_online_page();
    }

    @Then("^user redirect to customer service page$")
    public void user_redirect_to_customer_service_page() throws Throwable {
        customerServicePage.user_redirect_to_customer_service_page();

     }

    }
