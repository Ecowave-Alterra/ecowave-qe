package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Category;
import starter.admin.Product;

public class CategorySteps {
    @Steps
    Category category;
    @Given("I set GET endpoints product category")
    public void setGetApiEndpointProductCategory(){
        category.setApiEndpointProductCategory();
    }
    @When("I send GET HTTP request product category")
    public void sendGetHttpRequestProductCategory(){
        category.sendGetHttpRequestProductCategory();
    }
    @When("I send GET HTTP request product category without token")
    public void sendGetHttpRequestProductCategoryWithoutToken(){
        category.sendGetHttpRequestProductCategoryWithoutToken();
    }



//    @Given("I set POST endpoints create product category")
//    public void setPostApiEndpointCreateProductCategory(){
//        category.setApiEndpointCreateProductCategory();
//    }
//    @When("I send POST HTTP request create product category")
//    public void sendPostHTTPRequestCreateProductCategory(){
//        category.sendPostHttpRequestCreateProductCategory();
//    }
//    @When("I send POST HTTP request create product category incomplete data")
//    public void sendPostHTTPRequestCreateProductCategoryIncompleteData(){
//        category.sendPostHttpRequestCreateProductCategoryIncompleteData();
//    }
//    @When("I send POST HTTP request create product category without token")
//    public void sendPostHTTPRequestCreateProductCategoryWithoutToken(){
//        category.sendPostHttpRequestCreateProductCategoryWithoutToken();
//    }





    @Given("I set PUT endpoints category")
    public void setPutEndpointCategory(){
        category.setPutEndpointCategory();
    }
    @When("I send PUT HTTP request category")
    public void sendPutHttpRequestCategory(){
        category.sendPutHttpRequestCategory();
    }
    @Given("I set PUT endpoints category incomplete data")
    public void setPutEndpointCategoryIncompleteData(){
        category.setPutEndpointCategoryIncompleteData();
    }
    @When("I send PUT HTTP request category incomplete data")
    public void sendPutHttpRequestCategoryIncompleteData(){
        category.sendPutHttpRequestCategoryIncompleteData();
    }
    @When("I send PUT HTTP request category without token")
    public void sendPutHttpRequestCategoryWithoutToken(){
        category.sendPutHttpRequestCategoryWithoutToken();
    }




    @Given("I set DELETE endpoints category")
    public void setDeleteEndpointCategory(){
        category.setDeleteEndpointCategory();
    }
    @When("I send DELETE HTTP request category")
    public void sendDeleteHttpRequestCategory(){
        category.sendDeleteHttpRequestCategory();
    }
    @Given("I set DELETE endpoints category by wrong id")
    public void setDeleteEndpointCategoryByWrongId(){
        category.setDeleteEndpointCategoryByWrongId();
    }
    @When("I send DELETE HTTP request category by wrong id")
    public void sendDeleteHttpRequestCategoryByWrongId(){
        category.sendDeleteHttpRequestCategoryByWrongId();
    }
    @When("I send DELETE HTTP request category without token")
    public void sendDeleteHttpRequestCategoryWithoutToken(){
        category.sendDeleteHttpRequestCategoryWithoutToken();
    }





    @Given("I set GET endpoints search category")
    public void setGetApiEndpointSearchCategory(){

        category.setApiEndpointSearchCategory();
    }
    @When("I send GET HTTP request search category")
    public void sendGetHttpRequestSearchCategory(){

        category.sendGetHttpRequestSearchCategory();
    }
    @Given("I set GET endpoints search not exist category")
    public void setGetApiEndpointSearchNotExistsCategory(){

        category.setApiEndpointSearchNotExistsCategory();
    }
    @When("I send GET HTTP request search not exist category")
    public void sendGetHttpRequestSearchNotExistsCategory(){

        category.sendGetHttpRequestSearchNotExistsCategory();
    }
    @When("I send GET HTTP request search category without token")
    public void sendGetHttpRequestSearchCategoryWithoutToken(){

        category.sendGetHttpRequestSearchCategoryWithoutToken();
    }
    @Given("I set GET endpoints search category by page number")
    public void setGetApiEndpointSearchCategoryByPageNumber(){

        category.setApiEndpointSearchCategoryByPageNumber();
    }
    @When("I send GET HTTP request search category by page number")
    public void sendGetHttpRequestSearchCategoryByPageNumber(){

        category.sendGetHttpRequestSearchCategoryByPageNumber();
    }
    @Given("I set GET endpoints search not exist category by page number")
    public void setGetApiEndpointSearchNotExistsCategoryByPageNumber(){

        category.setApiEndpointSearchNotExistsCategoryByPageNumber();
    }
    @When("I send GET HTTP request search not exist category by page number")
    public void sendGetHttpRequestSearchNotExistsCategoryByPageNumber(){

        category.sendGetHttpRequestSearchNotExistsCategoryByPageNumber();
    }
}
