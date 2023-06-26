package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegistrationScreen extends BasePageObject {

    private By profileButton() {
        return MobileBy.AccessibilityId("Saya");
    }

    private By homeButton() {
        return MobileBy.AccessibilityId("Beranda");
    }

    private By registerButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc='Register']");
    }

    private By submitRegisterButton() {
        return MobileBy.AccessibilityId("Register");
    }

    @Step
    public void tapProfileButton() {
        onClick(profileButton());
    }

    @Step
    public void tapSubmitRegisterButton() {
        onClick(submitRegisterButton());
    }

    @Step
    public boolean isHomeButtonExist() {
        return waitUntilVisible(homeButton()).isDisplayed();
    }

    @Step
    public void tapRegisterButton() {
        onClick(registerButton());
    }

    private By nameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }

    private By userNameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    }

    private By phoneNumberField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]");
    }

    @Step
    public void inputNameField(String name) {
        onClick(nameField());
        onType(nameField(), name);
    }

    @Step
    public void inputEmailField(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputUserNameField(String userName) {
        onClick(userNameField());
        onType(userNameField(), userName);
    }

    @Step
    public void inputPhoneNumberField(String phoneNumber) {
        onClick(phoneNumberField());
        onType(phoneNumberField(), phoneNumber);
    }

    @Step
    public void inputPasswordField(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }
}
