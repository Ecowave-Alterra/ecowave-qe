package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Authentication;

public class AuthenticationSteps {
    @Steps
    Authentication authentication;

    @Given("I set POST endpoints login")
    public void setPostApiEndpointLogin() {
        authentication.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHTTPRequestLogin() {
        authentication.sendPostHttpRequestLogin();
    }
    @And("I receive Message Berhasil Login")
    public void receiveMessageBerhasilLogin(){
        authentication.validateMessageBerhasilLogin();
    }
    @Then("I receive valid HTTP response code 200")
    public void receiveHTTPResponseCode200(){
        authentication.validateHttpResponseCode200();
    }
    @When("I send POST HTTP request login empty email")
    public void sendPostHTTPRequestLoginEmptyEmail() {
        authentication.sendPostHttpRequestLoginEmptyEmail();
    }
    @Then("I receive valid HTTP response code 400")
    public void receiveHTTPResponseCode400(){
        authentication.validateHttpResponseCode400();
    }
    @When("I send POST HTTP request login wrong email and password")
    public void sendPostHTTPRequestLoginWrongEmailPassword() {
        authentication.sendPostHttpRequestLoginWrongEmailPassword();
    }
}
