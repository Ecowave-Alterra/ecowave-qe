package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import test.automation.pages.CartScreen;
import test.automation.pages.RegistrationScreen;

public class CartSteps {

    @Steps
    CartScreen cartScreen = new CartScreen();

    @Given("user press Ecoshop icon")
    public void userPressEcoshopIcon() {
        cartScreen.tapEcommerceButton();
        cartScreen.waitUntilOnEcommerce();
    }

    @When("user select a product card")
    public void userSelectAProductCard() {
        cartScreen.tapProductCard();
    }

    @Then("user will be directed to detail page")
    public void userWillBeDirectedToDetailPage() {
    }

    @And("user press Keranjang button")
    public void userPressKeranjangButton() {
    }

    @And("user press cart icon")
    public void userPressCartIcon() {
    }

    @Then("user will see the same product title")
    public void userWillSeeTheSameProductTitle() {
    }
}
