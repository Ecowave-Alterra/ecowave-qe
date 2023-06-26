package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import com.github.javafaker.Faker;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Auth {
    protected String url = "https://ecowave-h64wmjjkza-uc.a.run.app/";
    public String name = randomName();
    public String email = randomEmail();
    public String username = randomUsername();
    @Step("I set POST endpoints user login")
    public String setPostApiEndpointUserLogin() {
        return url + "user/login";
    }

    @Step("I send POST HTTP request user login")
    public void sendPostHttpRequestUserLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "user1@gmail.com");
        requestBody.put("Password", "user1");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserLogin());
    }
    @Step("I receive Message user Berhasil Login")
    public void validateMessageUserBerhasilLogin() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Berhasil login")));
    }
    @Step("I send POST HTTP request user login empty email")
    public void sendPostHttpRequestUserLoginEmptyEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "");
        requestBody.put("Password", "user1");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserLogin());
    }
    @Step("I receive Message user Masukkan Email")
    public void validateMessageUserMasukkanEmail() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Masukkan Email")));
    }
    @Step("I send POST HTTP request user login wrong password")
    public void sendPostHttpRequestUserLoginWrongPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "user1@gmail.com");
        requestBody.put("Password", "passwordsalah");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserLogin());
    }
    @Step("I receive Message user Email atau password salah")
    public void validateMessageUserEmailAtauPasswordSalah() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Email atau password salah")));
    }




    @Step("I set POST endpoints user register")
    public String setPostApiEndpointUserRegister() {
        return url + "user/register";
    }

    @Step("I send POST HTTP request user register")
    public void sendPostHttpRequestUserRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", randomName());
        requestBody.put("email", randomEmail());
        requestBody.put("username", randomUsername());
        requestBody.put("phone", "085939647001");
        requestBody.put("password", "Password1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserRegister());
    }
    @Step("I receive Message user Register Sukses")
    public void validateMessageUserRegisterSukses() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Register Sukses")));
    }
    @Step("I send POST HTTP request user register already exists email")
    public void sendPostHttpRequestUserRegisterEmailAlreadyExistsEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", randomName());
        requestBody.put("email", "user1@gmail.com");
        requestBody.put("username", randomUsername());
        requestBody.put("phone", "085939647001");
        requestBody.put("password", "Password1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserRegister());
    }
    @Step("I receive Message user Email already exists")
    public void validateMessageUserEmailAlreadyExists() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Email already exists")));
    }
    @Step("I send POST HTTP request user register not valid email")
    public void sendPostHttpRequestUserRegisterNotValidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", randomName());
        requestBody.put("email", "notvalidemail");
        requestBody.put("username", randomUsername());
        requestBody.put("phone", "085939647001");
        requestBody.put("password", "Password1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserRegister());
    }
//    @Step("I receive Message user Email yang anda masukkan tidak valid")
//    public void validateMessageUserEmailNotValid() {
//        restAssuredThat(response -> response.body("'Message'", equalTo("Email yang anda masukkan tidak valid")));
//    }
    @Step("I send POST HTTP request user register empty email")
    public void sendPostHttpRequestUserRegisterEmptyEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", randomName());
        requestBody.put("email", "");
        requestBody.put("username", randomUsername());
        requestBody.put("phone", "085939647001");
        requestBody.put("password", "Password1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserRegister());
    }
    @Step("I send POST HTTP request user register not valid phone")
    public void sendPostHttpRequestUserRegisterNotValidPhone(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", randomName());
        requestBody.put("email", randomEmail());
        requestBody.put("username", randomUsername());
        requestBody.put("phone", "phone123");
        requestBody.put("password", "Password1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserRegister());
    }
    @Step("I receive Message user Phone tidak valid")
    public void validateMessageUserPhoneNotValid() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Phone tidak valid")));
    }






    @Step("I set POST endpoints user forgot password")
    public String setPostApiEndpointUserForgotPassword() {
        return url + "user/forgot-password";
    }

    @Step("I send POST HTTP request user forgot password")
    public void sendPostHttpRequestUserForgotPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "user1@gmail.com");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserForgotPassword());
    }
    @Step("I receive Message user Berhasil mengirim kode otp")
    public void validateMessageUserBerhasilMengirimKodeOtp() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Berhasil mengirim kode otp")));
    }
    @Step("I send POST HTTP request user forgot password invalid email")
    public void sendPostHttpRequestUserForgotPasswordInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "user1gmail.com");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserForgotPassword());
    }
    @Step("I receive Message user Email yang anda masukkan tidak valid")
    public void validateMessageUserEmailYangAndaMasukkanTidakValid() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Email yang anda masukkan tidak valid")));
    }
    @Step("I send POST HTTP request user forgot password not exists email")
    public void sendPostHttpRequestUserForgotPasswordNotExistsEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "notexistsemail@gmail.com");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserForgotPassword());
    }
    @Step("I receive Message user Email tidak ditemukan")
    public void validateMessageUserEmailTidakDitemukan() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Email tidak ditemukan")));
    }







    @Step("I set POST endpoints user change password")
    public String setPostApiEndpointUserChangePassword() {
        return url + "user/change-password";
    }

    @Step("I send POST HTTP request user change password")
    public void sendPostHttpRequestUserChangePassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testinggiel2@gmail.com");
        requestBody.put("password", "testgieldy1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserChangePassword());
    }
    @Step("I receive Message user Berhasil mengganti password")
    public void validateMessageUserBerhasilMenggantiPassword() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Berhasil mengganti password")));
    }
    @Step("I send POST HTTP request user change password invalid email")
    public void sendPostHttpRequestUserChangePasswordInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testgieldygmail.com");
        requestBody.put("password", "testgieldy1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserChangePassword());
    }
    @Step("I send POST HTTP request user change password not exists email")
    public void sendPostHttpRequestUserChangePasswordNotExistsEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "tidakadaemail99@gmail.com");
        requestBody.put("password", "testgieldy1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointUserChangePassword());
    }









    public String randomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public String randomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
    public String randomUsername() {
        Faker faker = new Faker();
        return faker.name().username();
    }
}
