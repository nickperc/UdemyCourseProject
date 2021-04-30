package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/main/java/com/api/cucumber/featureFile/Login.feature"},
        glue={"com/api/cucumber/stepdfn"},
        dryRun = false,
        monochrome = true
)
public class UserLogin {

}
