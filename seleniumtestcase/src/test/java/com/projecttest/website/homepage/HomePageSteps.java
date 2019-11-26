package com.projecttest.website.homepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to HomePage \"([^\"]*)\"$")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @Then("^page about is \"([^\"]*)\"$")
    public void pageAboutIs(String title) {
        this.homePage.checkAboutInfo(title);
    }
}
