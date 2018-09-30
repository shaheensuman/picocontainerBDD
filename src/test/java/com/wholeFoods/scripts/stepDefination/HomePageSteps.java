package com.wholeFoods.scripts.stepDefination;

import com.wholefoods.framework.cucumberTestContext.TestContext;
import com.wholefoods.framework.pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        this.testContext = context;
        homePage=testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user navigate wholefoods page$")
    public void user_navigate_wholefoods_page() throws Throwable {
    homePage.user_navigate_wholefoods_page();

        System.out.println("step One");
    }

    @When("^user count navbar option$")
    public void user_count_navbar_option() throws Throwable {
        homePage.user_count_navbar_option();
        System.out.println("step Two");

    }

    @Then("^user verify total number of nav bars$")
    public void user_verify_total_number_of_nav_bars() throws Throwable {
        homePage.user_count_navbar_option();
        System.out.println("step three");
    }

    @When("^user click on localsales link$")
    public void user_click_on_localsales_link() throws Throwable {
        homePage.user_click_on_localsales_link();
    }

    @When("^user click on customer service page$")
    public void user_click_on_customer_service_page() throws Throwable {
        homePage.user_click_on_customer_service_page();
    }

}
