package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Category;
import starter.admin.Order;

public class OrderSteps {
    @Steps
    Order order;
    @Given("I set GET endpoints order")
    public void setGetApiEndpointOrder(){
        order.setApiEndpointOrder();
    }
    @When("I send GET HTTP request order")
    public void sendGetHttpRequestOrder(){
        order.sendGetHttpRequestOrder();
    }
    @When("I send GET HTTP request order without token")
    public void sendGetHttpRequestOrderWithoutToken(){
        order.sendGetHttpRequestOrderWithoutToken();
    }
    @Given("I set GET endpoints order by page size")
    public void setGetApiEndpointOrderByPageSize(){
        order.setApiEndpointOrderByPageSize();
    }
    @When("I send GET HTTP request order by page size")
    public void sendGetHttpRequestOrderByPageSize(){
        order.sendGetHttpRequestOrderByPageSize();
    }
    @Given("I set GET endpoints order by page number")
    public void setGetApiEndpointOrderByPageNumber(){
        order.setApiEndpointOrderByPageNumber();
    }
    @When("I send GET HTTP request order by page number")
    public void sendGetHttpRequestOrderByPageNumber(){
        order.sendGetHttpRequestOrderByPageNumber();
    }
    @Given("I set GET endpoints order by status")
    public void setGetApiEndpointOrderByStatus(){
        order.setApiEndpointOrderByStatus();
    }
    @When("I send GET HTTP request order by status")
    public void sendGetHttpRequestOrderByStatus(){
        order.sendGetHttpRequestOrderByStatus();
    }



    @Given("I set GET endpoints order by id")
    public void setGetApiEndpointOrderById(){
        order.setApiEndpointOrderById();
    }
    @When("I send GET HTTP request order by id")
    public void sendGetHttpRequestOrderById(){

        order.sendGetHttpRequestOrderById();
    }
    @When("I send GET HTTP request order by id without token")
    public void sendGetHttpRequestOrderByIdWithoutToken(){

        order.sendGetHttpRequestOrderByIdWithoutToken();
    }
    @Given("I set GET endpoints order by invalid id")
    public void setGetApiEndpointOrderByInvalidId(){
        order.setApiEndpointOrderByInvalidId();
    }
    @When("I send GET HTTP request order by invalid id")
    public void sendGetHttpRequestOrderByInvalidId(){

        order.sendGetHttpRequestOrderByInvalidId();
    }





    @Given("I set PUT endpoints order")
    public void setPutEndpointOrder(){
        order.setPutEndpointOrder();
    }
    @When("I send PUT HTTP request order")
    public void sendPutHttpRequestOrder(){
        order.sendPutHttpRequestOrder();
    }
    @When("I send PUT HTTP invalid request order")
    public void sendPutHttpInvalidRequestOrder(){
        order.sendPutHttpInvalidRequestOrder();
    }
    @Given("I set PUT endpoints order invalid id")
    public void setPutEndpointOrderInvalidId(){
        order.setPutEndpointOrderInvalidId();
    }
    @When("I send PUT HTTP request order invalid id")
    public void sendPutHttpRequestOrderInvalidId(){
        order.sendPutHttpRequestOrderInvalidId();
    }
    @When("I send PUT HTTP request order invalid token")
    public void sendPutHttpRequestOrderInvalidToken(){
        order.sendPutHttpRequestOrderInvalidToken();
    }
}
