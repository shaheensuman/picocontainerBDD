package com.wholeFoods.scripts.stepDefination;

import com.wholefoods.framework.cucumberTestContext.TestContext;
import com.wholefoods.framework.pageObjects.ShopOnlinePage;
import cucumber.api.java.en.When;

public class ShopIOnlinePageSteps {

    TestContext testContext;
    ShopOnlinePage shopOnlinePage;

    public ShopIOnlinePageSteps(TestContext testContext) {
        this.testContext = testContext;
        shopOnlinePage=testContext.getPageObjectManager().getShopOnlinePage();
    }

    @When("^user click on contact us link$")
    public void user_click_on_contact_us_link() throws Throwable {
       shopOnlinePage.user_click_on_contact_us_link();
    }


}
