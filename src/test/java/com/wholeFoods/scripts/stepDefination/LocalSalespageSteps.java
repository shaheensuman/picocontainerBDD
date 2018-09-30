package com.wholeFoods.scripts.stepDefination;

import com.wholefoods.framework.cucumberTestContext.TestContext;
import com.wholefoods.framework.pageObjects.LocalSalesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocalSalespageSteps {
    TestContext testContext;
    LocalSalesPage localSalesPage;

    public LocalSalespageSteps(TestContext testContext) {
        this.testContext = testContext;
        localSalesPage=testContext.getPageObjectManager().getLocalSalesPage();
    }

    @Then("^user navigate to local sales page$")
    public void user_navigate_to_local_sales_page() throws Throwable {
        localSalesPage.user_navigate_to_local_sales_page();
    }

    @When("^user click on select user location dropbox$")
    public void user_click_on_select_user_location_dropbox() throws Throwable {
    localSalesPage.user_click_on_select_user_location_dropbox();
    }

    @When("^user select \"([^\"]*)\" as state$")
    public void user_select_as_state(String state) throws Throwable {
        localSalesPage.user_select_as_state(state);
    }

    @When("^user click on select a store drop box$")
    public void user_click_on_select_a_store_drop_box() throws Throwable {
        localSalesPage.user_click_on_select_a_store_drop_box();
    }

    @When("^user select \"([^\"]*)\" as store location$")
    public void user_select_as_store_location(String store) throws Throwable {
        localSalesPage.user_select_as_store_location(store);
    }

    @When("^user click on view store button$")
    public void user_click_on_view_store_button() throws Throwable {
        localSalesPage.user_click_on_view_store_button();
    }

    @Then("^user verify city name appare at the top$")
    public void user_verify_city_name_appare_at_the_top() throws Throwable {
        localSalesPage.user_verify_city_name_appare_at_the_top();
    }
}
