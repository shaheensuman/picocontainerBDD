package com.wholefoods.framework.pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class PageBase {
    protected WebDriver driver;

    public PageBase() {
    }

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
}
