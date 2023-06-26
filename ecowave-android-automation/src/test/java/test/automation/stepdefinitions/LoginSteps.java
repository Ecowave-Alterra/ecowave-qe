package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jpackage.internal.Log;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import test.automation.pages.LoginScreen;
import test.automation.pages.RegistrationScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    RegistrationScreen registrationScreen;
    private String email;

    @Given("user has successfully register")
    public void androidUserHasSuccessfullyRegister() {
        registrationScreen.tapProfileButton();
        registrationScreen.tapRegisterButton();
        String randomName= RandomStringUtils.random(10,true, false);
        email = RandomStringUtils.random(10,true, true)+"@gmail.com";
        String phoneNumber = "08" + RandomStringUtils.random(10,false, true);

        registrationScreen.inputNameField(randomName);
        registrationScreen.inputEmailField(email);
        registrationScreen.inputUserNameField(randomName);
        registrationScreen.inputPhoneNumberField(phoneNumber);
        registrationScreen.inputPasswordField("test@1234");

        registrationScreen.tapSubmitRegisterButton();
    }

    @When("user navigate to login page")
    public void userNavigateToLoginPage() {
        loginScreen.tapProfileButton();
        loginScreen.tapLoginButton();
    }

    @And("user input registered email")
    public void userInputRegisteredEmail() {
        loginScreen.inputEmailField(email);
    }

    @And("user input password: {string}")
    public void userInputPassword(String password) {
        loginScreen.inputPasswordField(password);
    }

    @And("user tap login button")
    public void userTapLoginButton() {
        loginScreen.tapSubmitLoginButton();
    }

    @Then("user see email message displayed on home screen")
    public void userSeeEmailMessageDisplayedOnHomeScreen() {
    }
}
