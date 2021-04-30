package com.api.cucumber.stepdfn;

import com.api.cucumber.BaseClass;
import com.api.cucumber.transform.TransformData;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDefinition {

    private BaseClass baseClass;

    public PostStepDefinition(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Given("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        System.out.println("Given User should be logged in ==>" + baseClass.getFeatureName());
        System.out.println("Given User should be logged in ==>" + baseClass.getScenarioName());
    }

    @When("^I type the text as \"([^\"]*)\" in the text box$")
    public void i_type_the_text_as_something_in_the_text_box(String strArg1) throws Throwable {
        System.out.println("Value: " + strArg1);
    }

    @When("^User supply the Youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_something_in_the_text_box(@Transform(TransformData.class) String strArg1) throws Throwable {
        System.out.println("Value: " + strArg1);
    }

    @Then("^The message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
        System.out.println("Then The message should get posted");
    }

    @Then("^Video should get posted on the user wall$")
    public void video_should_get_posted_on_the_user_wall() throws Throwable {
        System.out.println("Then Video should get posted on the user wall");
    }

    @And("^should be present at its own wall$")
    public void should_be_present_at_its_own_wall() throws Throwable {
        System.out.println("And should be present at its own wall");
    }

    @And("^Click on post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("And Click on post button");
    }

    @And("^The video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail() throws Throwable {
        System.out.println("And The video should have proper thumbnail");
    }
}
