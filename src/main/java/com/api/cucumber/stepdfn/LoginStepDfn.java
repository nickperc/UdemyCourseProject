package com.api.cucumber.stepdfn;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginStepDfn {

    @Given("User is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() throws Throwable {
    }

    @When("User login with the following username and password")
    public void user_login_with_the_following_username_and_password(DataTable table) throws Throwable {
//        List<List<String>> data = table.raw();
//
//        for (List<String> str : data) {
//            for (String str1 : str) {
//                System.out.println("Data : " + str1);
//            }
//        }
//888888888888888888888888888888888888888888888888888888888888888888888888888888
//        Map<String, String> data = table.asMap(String.class,String.class);
//
//        for (String key : data.keySet()) {
//            System.out.println(String.format("Key : %s , Value : %s ",key,data.get(key)));
//        }

        List<String> dataList = table.asList(String.class);

        for (String key : dataList) {
            System.out.println(String.format("Value : %s",key));
        }
    }

    @Then("User should be able to login with correct username and password")
    public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
    }
}
