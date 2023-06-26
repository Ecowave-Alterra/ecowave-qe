package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By profileButton() {
        return MobileBy.AccessibilityId("Saya");
    }
    private By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    private By submitLoginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc='Login']");
    }

    private By emailFieldAfterClick() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }

    private By passwordFieldAfterClick() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }

    @Step
    public void tapProfileButton() {
        onClick(profileButton());
    }

    @Step
    public void tapSubmitLoginButton() {
        onClick(submitLoginButton());
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void inputEmailField(String email) {
        onClick(emailField());
        onType(emailFieldAfterClick(), email);
    }

    @Step
    public void inputPasswordField(String password) {
        onClick(passwordFieldAfterClick());
        onType(passwordFieldAfterClick(), password);
    }
}
