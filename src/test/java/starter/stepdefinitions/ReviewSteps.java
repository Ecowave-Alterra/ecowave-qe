package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Order;
import starter.admin.Review;

public class ReviewSteps {
    @Steps
    Review review;
    @Given("I set GET endpoints review")
    public void setGetApiEndpointReview(){
        review.setApiEndpointReview();
    }
    @When("I send GET HTTP request review")
    public void sendGetHttpRequestReview(){
        review.sendGetHttpRequestReview();
    }
    @When("I send GET HTTP request review without token")
    public void sendGetHttpRequestReviewWithoutToken(){
        review.sendGetHttpRequestReviewWithoutToken();
    }
    @Given("I set GET endpoints review by page number")
    public void setGetApiEndpointReviewByPageNumber(){
        review.setApiEndpointReviewByPageNumber();
    }
    @When("I send GET HTTP request review by page number")
    public void sendGetHttpRequestReviewByPageNumber(){
        review.sendGetHttpRequestReviewByPageNumber();
    }





    @Given("I set GET endpoints review by id")
    public void setGetApiEndpointReviewById(){
        review.setApiEndpointReviewById();
    }
    @When("I send GET HTTP request review by id")
    public void sendGetHttpRequestReviewById(){

        review.sendGetHttpRequestReviewById();
    }
    @When("I send GET HTTP request review by id without token")
    public void sendGetHttpRequestReviewByIdWithoutToken(){

        review.sendGetHttpRequestReviewByIdWithoutToken();
    }
    @Given("I set GET endpoints review by invalid id")
    public void setGetApiEndpointReviewByInvalidId(){
        review.setApiEndpointReviewByInvalidId();
    }
    @When("I send GET HTTP request review by invalid id")
    public void sendGetHttpRequestReviewByInvalidId(){

        review.sendGetHttpRequestReviewByInvalidId();
    }
}
