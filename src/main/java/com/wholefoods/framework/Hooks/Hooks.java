package com.wholefoods.framework.Hooks;

import com.wholefoods.framework.cucumberTestContext.TestContext;
import com.wholefoods.framework.managers.FileReaderManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
 TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setUp() throws IOException {
         testContext.getWebDriverManager().getDriver().navigate().to(FileReaderManager.getFileReaderManager().getConfigFileReader().getApplicationUrl());
        testContext.getWebDriverManager().getDriver().manage().timeouts().implicitlyWait(FileReaderManager.getFileReaderManager().getConfigFileReader().getImplicitWait(), TimeUnit.SECONDS);
        testContext.getWebDriverManager().getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() throws IOException {
        testContext.getWebDriverManager().closeDriver();
    }
}
