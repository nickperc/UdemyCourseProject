package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/main/java/com/api/cucumber/featureFile/PostFeature.feature"},
        glue={"com/api/cucumber/stepdfn","com.api.cucumber.hooks"},
        monochrome = true
)
public class PostRunner {

}
