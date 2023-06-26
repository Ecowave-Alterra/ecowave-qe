package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Information;

public class InformationSteps {
    @Steps
    Information information;
    @Given("I set GET endpoints information")
    public void setGetApiEndpointInformation(){

        information.setApiEndpointInformation();
    }
    @When("I send GET HTTP request information")
    public void sendGetHttpRequestInformation(){

        information.sendGetHttpRequestInformation();
    }



    @Given("I set GET endpoints information by id")
    public void setGetApiEndpointInformationById(){

        information.setApiEndpointInformationById();
    }
    @When("I send GET HTTP request information by id")
    public void sendGetHttpRequestInformationById(){

        information.sendGetHttpRequestInformationById();
    }


    @Given("I set GET endpoints information by unavailable id")
    public void setGetApiEndpointInformationByUnavailableId(){

        information.setApiEndpointInformationByUnavailableId();
    }
    @When("I send GET HTTP request information by unavailable id")
    public void sendGetHttpRequestInformationByUnavailableId(){

        information.sendGetHttpRequestInformationByUnavailableId();
    }
    @Then("I receive valid HTTP response code 404")
    public void receiveHTTPResponseCode404(){
        information.validateHttpResponseCode404();
    }


    @Given("I set POST endpoints create information")
    public void setPostApiEndpointCreateInformation(){

        information.setApiEndpointCreateInformation();
    }
    @When("I send POST HTTP request create information")
    public void sendPostHTTPRequestCreateInformation(){
        information.sendPostHttpRequestCreateInformation();
    }
    @Then("I receive valid HTTP response code 201")
    public void receiveHTTPResponseCode201(){
        information.validateHttpResponseCode201();
    }
    @When("I send POST HTTP request create information blank data")
    public void sendPostHTTPRequestCreateInformationBlankData(){
        information.sendPostHttpRequestCreateInformationBlankData();
    }
    @Then("I receive valid HTTP response code 422")
    public void receiveHTTPResponseCode422(){
        information.validateHttpResponseCode422();
    }


    @Given("I set GET endpoints search information by id")
    public void setGetApiEndpointSearchInformationById(){

        information.setApiEndpointSearchInformationById();
    }
    @When("I send GET HTTP request search information by id")
    public void sendGetHttpRequestSearchInformationById(){

        information.sendGetHttpRequestSearchInformationById();
    }
    @Given("I set GET endpoints search unavailable information by id")
    public void setGetApiEndpointSearchUnavailableInformationById(){

        information.setApiEndpointSearchUnavailableInformationById();
    }
    @When("I send GET HTTP request search unavailable information by id")
    public void sendGetHttpRequestSearchUnavailableInformationById(){

        information.sendGetHttpRequestSearchUnavailableInformationById();
    }

    @Given("I set DELETE endpoints information")
    public void setDeleteEndpointInformation(){
        information.setDeleteEndpointInformation();
    }
    @When("I send DELETE HTTP request information")
    public void sendDeleteHttpRequestInformation(){
        information.sendDeleteHttpRequestInformation();
    }
}

