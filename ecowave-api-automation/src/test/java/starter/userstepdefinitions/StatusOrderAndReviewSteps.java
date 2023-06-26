package starter.userstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Order;
import starter.user.StatusOrderAndReview;

public class StatusOrderAndReviewSteps {
    @Steps
    StatusOrderAndReview statusOrderAndReview;
    @Given("I set GET endpoints transactions")
    public void setGetApiEndpointTransactions(){
        statusOrderAndReview.setApiEndpointTransactions();
    }
    @When("I send GET HTTP request transactions")
    public void sendGetHttpRequestTransactions(){
        statusOrderAndReview.sendGetHttpRequestTransactions();
    }
    @Given("I set GET endpoints transactions belum dibayar")
    public void setGetApiEndpointTransactionsBelumDibayar(){
        statusOrderAndReview.setApiEndpointTransactionsBelumDibayar();
    }
    @When("I send GET HTTP request transactions belum dibayar")
    public void sendGetHttpRequestTransactionsBelumDibayar(){
        statusOrderAndReview.sendGetHttpRequestTransactionsBelumDibayar();
    }
    @Given("I set GET endpoints transactions dikemas")
    public void setGetApiEndpointTransactionsDikemas(){
        statusOrderAndReview.setApiEndpointTransactionsDikemas();
    }
    @When("I send GET HTTP request transactions dikemas")
    public void sendGetHttpRequestTransactionsDikemas(){
        statusOrderAndReview.sendGetHttpRequestTransactionsDikemas();
    }
    @Given("I set GET endpoints transactions dikirim")
    public void setGetApiEndpointTransactionsDikirim(){
        statusOrderAndReview.setApiEndpointTransactionsDikirim();
    }
    @When("I send GET HTTP request transactions dikirim")
    public void sendGetHttpRequestTransactionsDikirim(){
        statusOrderAndReview.sendGetHttpRequestTransactionsDikirim();
    }
    @Given("I set GET endpoints transactions selesai")
    public void setGetApiEndpointTransactionsSelesai(){
        statusOrderAndReview.setApiEndpointTransactionsSelesai();
    }
    @When("I send GET HTTP request transactions selesai")
    public void sendGetHttpRequestTransactionsSelesai(){
        statusOrderAndReview.sendGetHttpRequestTransactionsSelesai();
    }
    @Given("I set GET endpoints transactions dibatalkan")
    public void setGetApiEndpointTransactionsDibatalkan(){
        statusOrderAndReview.setApiEndpointTransactionsDibatalkan();
    }
    @When("I send GET HTTP request transactions dibatalkan")
    public void sendGetHttpRequestTransactionsDibatalkan(){
        statusOrderAndReview.sendGetHttpRequestTransactionsDibatalkan();
    }
    @Given("I set GET endpoints transactions invalid filter")
    public void setGetApiEndpointTransactionsInvalidFilter(){
        statusOrderAndReview.setApiEndpointTransactionsInvalidFilter();
    }
    @When("I send GET HTTP request transactions invalid filter")
    public void sendGetHttpRequestTransactionsInvalidFilter(){
        statusOrderAndReview.sendGetHttpRequestTransactionsInvalidFilter();
    }
    @Given("I set GET endpoints transactions invalid token")
    public void setGetApiEndpointTransactionsInvalidToken(){
        statusOrderAndReview.setApiEndpointTransactionsInvalidToken();
    }
    @When("I send GET HTTP request transactions invalid token")
    public void sendGetHttpRequestTransactionsInvalidToken(){
        statusOrderAndReview.sendGetHttpRequestTransactionsInvalidToken();
    }




    @Given("I set POST endpoints confirm order")
    public void setPostApiEndpointConfirmOrder() {
        statusOrderAndReview.setPostApiEndpointConfirmOrder();
    }

    @When("I send POST HTTP request confirm order")
    public void sendPostHTTPRequestConfirmOrder() {statusOrderAndReview.sendPostHttpRequestConfirmOrder();
    }
    @When("I send POST HTTP request confirm order invalid status")
    public void sendPostHTTPRequestConfirmOrderInvalidStatus() {statusOrderAndReview.sendPostHttpRequestConfirmOrderInvalidStatus();
    }
    @When("I send POST HTTP request confirm order invalid token")
    public void sendPostHTTPRequestConfirmOrderInvalidToken() {statusOrderAndReview.sendPostHttpRequestConfirmOrderInvalidToken();
    }
    @When("I send POST HTTP request confirm order invalid id")
    public void sendPostHTTPRequestConfirmOrderInvalidId() {statusOrderAndReview.sendPostHttpRequestConfirmOrderInvalidId();
    }




    @Given("I set POST endpoints cancel order")
    public void setPostApiEndpointCancelOrder() {
        statusOrderAndReview.setPostApiEndpointCancelOrder();
    }

    @When("I send POST HTTP request cancel order")
    public void sendPostHTTPRequestCancelOrder() {statusOrderAndReview.sendPostHttpRequestCancelOrder();
    }
    @When("I send POST HTTP request cancel order invalid status")
    public void sendPostHTTPRequestCancelInvalidStatus() {statusOrderAndReview.sendPostHttpRequestCancelOrderInvalidStatus();
    }
    @When("I send POST HTTP request cancel order invalid token")
    public void sendPostHTTPRequestCancelInvalidToken() {statusOrderAndReview.sendPostHttpRequestCancelOrderInvalidToken();
    }
    @When("I send POST HTTP request cancel order invalid id")
    public void sendPostHTTPRequestCancelInvalidId() {statusOrderAndReview.sendPostHttpRequestCancelOrderInvalidId();
    }
}
