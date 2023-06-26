package test.automation.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.automation.pageobject.BasePageObject;

public class CartScreen extends BasePageObject {

    private By ecommerceButton() {
        return MobileBy.xpath("//android.view.View[@content-desc='EcoShop']");
    }

    private By ecommerceTitle(){
        return MobileBy.xpath("//android.view.View[@content-desc='EcoShop']");
    }

    private By productCard() {
        String content= "Tote Putih Polos Rp5.000 4.9";
        return MobileBy.xpath(String.format("//android.widget.ImageView[@content-desc=\"%s\"]",content));
    }
    @Step
    public void tapEcommerceButton() {
        onClick(ecommerceButton());
    }

    @Step
    public void waitUntilOnEcommerce(){
        waitUntilVisible(ecommerceTitle());
    }
    @Step
    public void tapProductCard() {
        waitUntilVisible(productCard()).click();
    }
}
