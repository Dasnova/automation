package io.general.tests.steps;

        import allpages.Common;
        import cucumber.api.PendingException;
        import cucumber.api.java.en.And;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.When;
        import cucumber.api.java.en.Then;
        import pages.williamhill.LoginPage;
        import io.general.tests.SignUpTests;



public class LoginSteps extends SignUpTests{

    LoginPage loginPage = new LoginPage();
    Common common = new Common();


    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        common.visit();

    }

    @When("^i click the login button$")
    public void i_click_the_login_button() throws Throwable {
        loginPage.clickLoginButton();

    }

    @And("^i enter my a valid login details$")
    public void i_enter_my_a_valid_login_details() throws Throwable {
        loginPage.enterUserName()
                .enterPassword()
                .clickSubmitButton();

    }


    @And("^i enter invalid login details$")
    public void i_enter_invalid_login_details() throws Throwable {
        loginPage.enterInvalidUserName()
                .enterInvalidPassword()
                .clickSubmitButton();

    }

    @Then("^I am able to access my account$")
    public void i_am_able_to_access_my_account() throws Throwable {
        loginPage.verifyLogin();

    }
    @Then("i am unable to access my account and get error")
    public void i_am_unable_to_access_my_account_and_get_error() {
        loginPage.verifyLoginError();
        throw new cucumber.api.PendingException();
    }

}