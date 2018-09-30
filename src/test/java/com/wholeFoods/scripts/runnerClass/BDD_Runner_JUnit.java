package com.wholeFoods.scripts.runnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jahangir shaheen on 8/26/2018.
 */
public class BDD_Runner_JUnit {
    @RunWith(Cucumber.class)
    @CucumberOptions( dryRun = false,
            strict = true,
            monochrome = true,
            tags = {"@reg"},
            features = "src//test//resources//features//HomePageFunctionality//HomePageNavbar.feature",
            glue = "com.wholeFoods.scripts//stepDefinations//HomePageSteps.java"
 )
    public class RunCukeTest {

    }
}