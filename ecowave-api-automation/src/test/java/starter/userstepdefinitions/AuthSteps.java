package starter.userstepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.admin.Authentication;
import starter.user.Auth;

public class AuthSteps {
    @Steps
    Auth auth;

    @Given("I set POST endpoints user login")
    public void setPostApiEndpointUserLogin() {
        auth.setPostApiEndpointUserLogin();
    }

    @When("I send POST HTTP request user login")
    public void sendPostHTTPRequestUserLogin() {
        auth.sendPostHttpRequestUserLogin();
    }
    @And("I receive Message user Berhasil Login")
    public void receiveMessageUserBerhasilLogin(){
        auth.validateMessageUserBerhasilLogin();
    }
    @When("I send POST HTTP request user login empty email")
    public void sendPostHTTPRequestUserLoginEmptyEmail() {
        auth.sendPostHttpRequestUserLoginEmptyEmail();
    }
    @And("I receive Message user Masukkan Email")
    public void receiveMessageUserMasukkanEmail(){
        auth.validateMessageUserMasukkanEmail();
    }
    @When("I send POST HTTP request user login wrong password")
    public void sendPostHTTPRequestUserLoginWrongPassword() {
        auth.sendPostHttpRequestUserLoginWrongPassword();
    }
    @And("I receive Message user Email atau password salah")
    public void receiveMessageUserEmailAtauPasswordSalah(){
        auth.validateMessageUserEmailAtauPasswordSalah();
    }



    @Given("I set POST endpoints user register")
    public void setPostApiEndpointUserRegister() {
        auth.setPostApiEndpointUserRegister();
    }
    @When("I send POST HTTP request user register")
    public void sendPostHTTPRequestUserRegister() {
        auth.sendPostHttpRequestUserRegister();
    }
    @And("I receive Message user Register Sukses")
    public void receiveMessageUserRegisterSukses(){
        auth.validateMessageUserRegisterSukses();
    }
    @When("I send POST HTTP request user register already exists email")
    public void sendPostHTTPRequestUserRegisterAlreadyExistsEmail() {
        auth.sendPostHttpRequestUserRegisterEmailAlreadyExistsEmail();
    }
    @And("I receive Message user Email already exists")
    public void receiveMessageUserEmailAlreadyExists(){
        auth.validateMessageUserEmailAlreadyExists();
    }
    @When("I send POST HTTP request user register not valid email")
    public void sendPostHTTPRequestUserRegisterNotValidEmail() {
        auth.sendPostHttpRequestUserRegisterNotValidEmail();
    }
    @When("I send POST HTTP request user register empty email")
    public void sendPostHTTPRequestUserRegisterEmptyEmail() {
        auth.sendPostHttpRequestUserRegisterEmptyEmail();
    }
    @When("I send POST HTTP request user register not valid phone")
    public void sendPostHTTPRequestUserRegisterNotValidPhone() {
        auth.sendPostHttpRequestUserRegisterNotValidPhone();
    }
    @And("I receive Message user Phone tidak valid")
    public void receiveMessageUserPhoneNotValid(){
        auth.validateMessageUserPhoneNotValid();
    }





    @Given("I set POST endpoints user forgot password")
    public void setPostApiEndpointUserForgotPassword() {
        auth.setPostApiEndpointUserForgotPassword();
    }
    @When("I send POST HTTP request user forgot password")
    public void sendPostHTTPRequestUserForgotPassword() {
        auth.sendPostHttpRequestUserForgotPassword();
    }
    @And("I receive Message user Berhasil mengirim kode otp")
    public void receiveMessageUserBerhasilMengirimKodeOtp(){
        auth.validateMessageUserBerhasilMengirimKodeOtp();
    }
    @When("I send POST HTTP request user forgot password invalid email")
    public void sendPostHTTPRequestUserForgotPasswordInvalidEmail() {
        auth.sendPostHttpRequestUserForgotPasswordInvalidEmail();
    }
    @And("I receive Message user Email yang anda masukkan tidak valid")
    public void receiveMessageUserEmailYangAndaMasukkanTidakValid(){
        auth.validateMessageUserEmailYangAndaMasukkanTidakValid();
    }
    @When("I send POST HTTP request user forgot password not exists email")
    public void sendPostHTTPRequestUserForgotPasswordNotExistsEmail() {
        auth.sendPostHttpRequestUserForgotPasswordNotExistsEmail();
    }
    @And("I receive Message user Email tidak ditemukan")
    public void receiveMessageUserEmailTidakDitemukan(){
        auth.validateMessageUserEmailTidakDitemukan();
    }





    @Given("I set POST endpoints user change password")
    public void setPostApiEndpointUserChangePassword() {
        auth.setPostApiEndpointUserChangePassword();
    }
    @When("I send POST HTTP request user change password")
    public void sendPostHTTPRequestUserChangePassword() {
        auth.sendPostHttpRequestUserChangePassword();
    }
    @And("I receive Message user Berhasil mengganti password")
    public void receiveMessageUserBerhasilMenggantiPassword(){
        auth.validateMessageUserBerhasilMenggantiPassword();
    }
    @When("I send POST HTTP request user change password invalid email")
    public void sendPostHTTPRequestUserChangePasswordInvalidEmail() {
        auth.sendPostHttpRequestUserChangePasswordInvalidEmail();
    }
    @When("I send POST HTTP request user change password not exists email")
    public void sendPostHTTPRequestUserChangePasswordNotExistsEmail() {
        auth.sendPostHttpRequestUserChangePasswordNotExistsEmail();
    }
}
