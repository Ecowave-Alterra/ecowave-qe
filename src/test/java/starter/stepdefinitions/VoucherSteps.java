package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Product;
import starter.admin.Voucher;

public class VoucherSteps {
    @Steps
    Voucher voucher;
    @Given("I set GET endpoints voucher")
    public void setGetApiEndpointVoucher(){

        voucher.setApiEndpointVoucher();
    }
    @When("I send GET HTTP request voucher")
    public void sendGetHttpRequestVoucher(){

        voucher.sendGetHttpRequestVoucher();
    }
    @When("I send GET HTTP request voucher without token")
    public void sendGetHttpRequestVoucherWithoutToken(){

        voucher.sendGetHttpRequestVoucherWithoutToken();
    }


    @Given("I set GET endpoints voucher by id")
    public void setGetApiEndpointVoucherById(){

        voucher.setApiEndpointVoucherById();
    }
    @When("I send GET HTTP request voucher by id")
    public void sendGetHttpRequestVoucherById(){

        voucher.sendGetHttpRequestVoucherById();
    }
    @Given("I set GET endpoints voucher by wrong id")
    public void setGetApiEndpointVoucherByWrongId(){

        voucher.setApiEndpointVoucherByWrongId();
    }
    @When("I send GET HTTP request voucher by wrong id")
    public void sendGetHttpRequestVoucherByWrongId(){

        voucher.sendGetHttpRequestVoucherByWrongId();
    }
    @Then("I receive valid HTTP response code 500")
    public void receiveHTTPResponseCode500(){
        voucher.validateHttpResponseCode500();
    }
    @When("I send GET HTTP request voucher by id without token")
    public void sendGetHttpRequestVoucherByIdWithoutToken(){

        voucher.sendGetHttpRequestVoucherByIdWithoutToken();
    }



    @Given("I set POST endpoints create voucher")
    public void setPostApiEndpointCreateVoucher(){
        voucher.setApiEndpointCreateVoucher();
    }
    @When("I send POST HTTP request create voucher")
    public void sendPostHTTPRequestCreateVoucher(){
        voucher.sendPostHttpRequestCreateVoucher();
    }
    @When("I send POST HTTP request create voucher incomplete data")
    public void sendPostHTTPRequestCreateVoucherIncompleteData(){
        voucher.sendPostHttpRequestCreateVoucherIncompleteData();
    }
    @When("I send POST HTTP request create voucher without token")
    public void sendPostHTTPRequestCreateVoucherWithoutToken(){
        voucher.sendPostHttpRequestCreateVoucherWithoutToken();
    }





    @Given("I set PUT endpoints voucher")
    public void setPutEndpointVoucher(){
        voucher.setPutEndpointVoucher();
    }
    @When("I send PUT HTTP request voucher")
    public void sendPutHttpRequestVoucher(){
        voucher.sendPutHttpRequestVoucher();
    }
    @Given("I set PUT endpoints voucher incomplete data")
    public void setPutEndpointVoucherIncompleteData(){
        voucher.setPutEndpointVoucherIncompleteData();
    }
    @When("I send PUT HTTP request voucher incomplete data")
    public void sendPutHttpRequestVoucherIncompleteData(){
        voucher.sendPutHttpRequestVoucherIncompleteData();
    }
    @When("I send PUT HTTP request voucher without token")
    public void sendPutHttpRequestVoucherWithoutToken(){
        voucher.sendPutHttpRequestVoucherWithoutToken();
    }



    @Given("I set DELETE endpoints voucher")
    public void setDeleteEndpointVoucher(){
        voucher.setDeleteEndpointVoucher();
    }
    @When("I send DELETE HTTP request voucher")
    public void sendDeleteHttpRequestVoucher(){
        voucher.sendDeleteHttpRequestVoucher();
    }
    @Given("I set DELETE endpoints voucher by wrong id")
    public void setDeleteEndpointVoucherByWrongId(){
        voucher.setDeleteEndpointVoucherByWrongId();
    }
    @When("I send DELETE HTTP request voucher by wrong id")
    public void sendDeleteHttpRequestVoucherByWrongId(){
        voucher.sendDeleteHttpRequestVoucherByWrongId();
    }
    @When("I send DELETE HTTP request voucher without token")
    public void sendDeleteHttpRequestVoucherWithoutToken(){
        voucher.sendDeleteHttpRequestVoucherWithoutToken();
    }
}
