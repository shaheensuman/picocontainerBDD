package com.wholefoods.framework.cucumberTestContext;

import com.wholefoods.framework.managers.PageObjectManager;
import com.wholefoods.framework.managers.WebDriverManager;

import java.io.IOException;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        webDriverManager=new WebDriverManager();
        pageObjectManager=new PageObjectManager(webDriverManager.getDriver());

    }

    public WebDriverManager getWebDriverManager(){
        return webDriverManager;
    }

    public  PageObjectManager getPageObjectManager(){
        return pageObjectManager;
    }
}
