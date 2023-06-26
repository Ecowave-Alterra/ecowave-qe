package starter.userstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.ECommerce;

public class ECommerceSteps {
    @Steps
    ECommerce eCommerce;
    @Given("I set GET endpoints ecommerce")
    public void setGetApiEndpointECommerce(){
        eCommerce.setApiEndpointECommerce();
    }
    @When("I send GET HTTP request ecommerce")
    public void sendGetHttpRequestOrder(){
        eCommerce.sendGetHttpRequestECommerce();
    }
    @Given("I set GET endpoints ecommerce exist filter")
    public void setGetApiEndpointECommerceExistFilter(){
        eCommerce.setApiEndpointECommerceExistFilter();
    }
    @When("I send GET HTTP request ecommerce exist filter")
    public void sendGetHttpRequestOrderExistFilter(){
        eCommerce.sendGetHttpRequestECommerceExistFilter();
    }
    @Given("I set GET endpoints ecommerce not exist filter")
    public void setGetApiEndpointECommerceNotExistFilter(){
        eCommerce.setApiEndpointECommerceNotExistFilter();
    }
    @When("I send GET HTTP request ecommerce not exist filter")
    public void sendGetHttpRequestOrderNotExistFilter(){
        eCommerce.sendGetHttpRequestECommerceNotExistFilter();
    }
}
