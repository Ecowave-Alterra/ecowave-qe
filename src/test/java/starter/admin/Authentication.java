package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Authentication {

    protected String url = "https://ecowave-h64wmjjkza-uc.a.run.app/";
    @Step("I set POST endpoints login")
    public String setPostApiEndpointLogin() {
        return url + "admin/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "admin@gmail.com");
        requestBody.put("Password", "admin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }
    @Step("I receive Message Berhasil Login")
    public void validateMessageBerhasilLogin() {
        restAssuredThat(response -> response.body("'Message'", equalTo("Berhasil login")));
    }
    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send POST HTTP request login empty email")
    public void sendPostHttpRequestLoginEmptyEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "");
        requestBody.put("Password", "admin123");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }
    @Step("I receive valid HTTP response code 400")
    public void validateHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I send POST HTTP request login wrong email and password")
    public void sendPostHttpRequestLoginWrongEmailPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "giel21@gmail.com");
        requestBody.put("Password", "gieldy1");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }
}
