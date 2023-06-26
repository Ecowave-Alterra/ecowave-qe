package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Product;

public class ProductSteps {
    @Steps
    Product product;
    @Given("I set GET endpoints product")
    public void setGetApiEndpointProduct(){

        product.setApiEndpointProduct();
    }
    @When("I send GET HTTP request product")
    public void sendGetHttpRequestProduct(){

        product.sendGetHttpRequestProduct();
    }
    @When("I send GET HTTP request product without token")
    public void sendGetHttpRequestProductWithoutToken(){

        product.sendGetHttpRequestProductWithoutToken();
    }
    @Then("I receive valid HTTP response code 401")
    public void receiveHTTPResponseCode401(){
        product.validateHttpResponseCode401();
    }

    @Given("I set GET endpoints product by id")
    public void setGetApiEndpointProductById(){

        product.setApiEndpointProductById();
    }
    @When("I send GET HTTP request product by id")
    public void sendGetHttpRequestProductById(){

        product.sendGetHttpRequestProductById();
    }
    @Given("I set GET endpoints product by wrong id")
    public void setGetApiEndpointProductByWrongId(){

        product.setApiEndpointProductByWrongId();
    }
    @When("I send GET HTTP request product by wrong id")
    public void sendGetHttpRequestProductByWrongId(){

        product.sendGetHttpRequestProductByWrongId();
    }
    @When("I send GET HTTP request product by id without token")
    public void sendGetHttpRequestProductByIdWithoutToken(){

        product.sendGetHttpRequestProductByIdWithoutToken();
    }


    @Given("I set GET endpoints search product")
    public void setGetApiEndpointSearchProduct(){

        product.setApiEndpointSearchProduct();
    }
    @When("I send GET HTTP request search product")
    public void sendGetHttpRequestSearchProduct(){

        product.sendGetHttpRequestSearchProduct();
    }
    @Given("I set GET endpoints search not exist product")
    public void setGetApiEndpointSearchNotExistsProduct(){

        product.setApiEndpointSearchNotExistsProduct();
    }
    @When("I send GET HTTP request search not exist product")
    public void sendGetHttpRequestSearchNotExistsProduct(){

        product.sendGetHttpRequestSearchNotExistsProduct();
    }
    @When("I send GET HTTP request search product without token")
    public void sendGetHttpRequestSearchProductWithoutToken(){

        product.sendGetHttpRequestSearchProductWithoutToken();
    }
    @Given("I set GET endpoints search product by filter")
    public void setGetApiEndpointSearchProductByFilter(){

        product.setApiEndpointSearchProductByFilter();
    }
    @When("I send GET HTTP request search product by filter")
    public void sendGetHttpRequestSearchProductByFilter(){

        product.sendGetHttpRequestSearchProductByFilter();
    }
    @Given("I set GET endpoints search not exist product by filter")
    public void setGetApiEndpointSearchNotExistsProductByFilter(){

        product.setApiEndpointSearchNotExistsProductByFilter();
    }
    @When("I send GET HTTP request search not exist product by filter")
    public void sendGetHttpRequestSearchNotExistsProductByFilter(){

        product.sendGetHttpRequestSearchNotExistsProductByFilter();
    }





    @Given("I set POST endpoints create product")
    public void setPostApiEndpointCreateProduct(){
        product.setApiEndpointCreateProduct();
    }
    @When("I send POST HTTP request create product")
    public void sendPostHTTPRequestCreateProduct(){
        product.sendPostHttpRequestCreateProduct();
    }
    @When("I send POST HTTP request create product incomplete data")
    public void sendPostHTTPRequestCreateProductIncompleteData(){
        product.sendPostHttpRequestCreateProductIncompleteData();
    }
    @When("I send POST HTTP request create product without token")
    public void sendPostHTTPRequestCreateProductWithoutToken(){
        product.sendPostHttpRequestCreateProductWithoutToken();
    }



    @Given("I set DELETE endpoints product")
    public void setDeleteEndpointProduct(){
        product.setDeleteEndpointProduct();
    }
    @When("I send DELETE HTTP request product")
    public void sendDeleteHttpRequestProduct(){
        product.sendDeleteHttpRequestProduct();
    }
    @Given("I set DELETE endpoints product by wrong id")
    public void setDeleteEndpointProductByWrongId(){
        product.setDeleteEndpointProductByWrongId();
    }
    @When("I send DELETE HTTP request product by wrong id")
    public void sendDeleteHttpRequestProductByWrongId(){
        product.sendDeleteHttpRequestProductByWrongId();
    }
    @When("I send DELETE HTTP request product without token")
    public void sendDeleteHttpRequestProductWithoutToken(){
        product.sendDeleteHttpRequestProductWithoutToken();
    }




    @Given("I set PUT endpoints product")
    public void setPutEndpointProduct(){
        product.setPutEndpointProduct();
    }
    @When("I send PUT HTTP request product")
    public void sendPutHttpRequestProduct(){
        product.sendPutHttpRequestProduct();
    }
    @Given("I set PUT endpoints product incomplete data")
    public void setPutEndpointProductIncompleteData(){
        product.setPutEndpointProductIncompleteData();
    }
    @When("I send PUT HTTP request product incomplete data")
    public void sendPutHttpRequestProductIncompleteData(){
        product.sendPutHttpRequestProductIncompleteData();
    }
    @When("I send PUT HTTP request product without token")
    public void sendPutHttpRequestProductWithoutToken(){
        product.sendPutHttpRequestProductWithoutToken();
    }
}
