package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import test.automation.pages.RegistrationScreen;

public class RegistrationSteps {
    @Steps
    RegistrationScreen registrationScreen = new RegistrationScreen();

    @Given("user on landing screen")
    public void userOnLandingScreen() {
        Assert.assertTrue(registrationScreen.isHomeButtonExist());
    }


    @When("user select profile page")
    public void userSelectProfilePage() {
        registrationScreen.tapProfileButton();
    }

    @And("user select register option")
    public void userSelectRegisterOption() {
        registrationScreen.tapRegisterButton();
    }

    @And("user fill valid name as: {string}")
    public void userFillValidNameAs(String name) {
        String nameInput = name.equals("randomized name")? RandomStringUtils.random(10,true,false): name;
        registrationScreen.inputNameField(nameInput);
    }

    @And("user fill valid non-registered email as: {string}")
    public void userFillValidNonRegisteredEmailAs(String email) {
        String emailInput = email.equals("randomized email")? RandomStringUtils.random(10,true,true)+"@gmail.com": email;
        registrationScreen.inputEmailField(emailInput);
    }

    @And("user fill valid username as: {string}")
    public void userFillValidUsernameAs(String username) {
        String userNameInput = username.equals("randomized username")? RandomStringUtils.random(10,true,true): username;
        registrationScreen.inputUserNameField(userNameInput);
    }

    @And("user fill valid phone number as: {string}")
    public void userFillValidPhoneNumberAs(String phoneNumber) {
        String phoneNumberInput = phoneNumber.equals("randomized phone number")? "08"+RandomStringUtils.randomNumeric(9): phoneNumber;
        registrationScreen.inputPhoneNumberField(phoneNumberInput);
    }

    @And("user fill valid password as: {string}")
    public void userFillValidPasswordAs(String password) {
        registrationScreen.inputPasswordField(password);
    }

    @And("user press submit register button")
    public void userPressRegister() {
        registrationScreen.tapSubmitRegisterButton();
    }

    @Then("user see {string} message on registration page")
    public void userSeeMessageOnRegistrationPage(String message) {
    }
}
