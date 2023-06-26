package starter.admin;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Information {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";

    @Step("I set GET endpoints information")
    public String setApiEndpointInformation(){

        return url + "/admin/informations";
    }

    @Step("I send GET HTTP request information")
    public void sendGetHttpRequestInformation(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointInformation());
    }


    @Step("I set GET endpoints information by id")
    public String setApiEndpointInformationById(){

        return url + "/admin/informations/b4639bbe-65a9-40f1-af8f-71dd6cd4187a";
    }

    @Step("I send GET HTTP request information by id")
    public void sendGetHttpRequestInformationById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointInformationById());
    }

    @Step("I set GET endpoints information by unavailable id")
    public String setApiEndpointInformationByUnavailableId(){

        return url + "/admin/informations/9f5161912bd5-3530-482c-b838-516889451";
    }

    @Step("I send GET HTTP request information by unavailable id")
    public void sendGetHttpRequestInformationByUnavailableId(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointInformationByUnavailableId());
    }
    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404() {

        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I set POST endpoints create information")
    public String setApiEndpointCreateInformation(){

        return url + "/admin/informations";
    }
    @Step("I send POST HTTP request create information")
    public void sendPostHttpRequestCreateInformation(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Title", "gield");
        requestBody.put("Content", "gield");
        requestBody.put("Status", "Terbit");
        requestBody.put("PhotoContentUrl", new File("ecowave-api-automation/bahan/LOGO.png"));
        SerenityRest.given().header("Authorization", token).header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>").post(setApiEndpointCreateInformation());
    }
    @Step("I receive valid HTTP response code 201")
    public void validateHttpResponseCode201() {

        restAssuredThat(response -> response.statusCode(201));
    }
        @Step("I send POST HTTP request create information blank data")
    public void sendPostHttpRequestCreateInformationBlankData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Title", "gield");
        requestBody.put("Content", "gield");
        requestBody.put("Status", "Terbit");
        requestBody.put("PhotoContentUrl", "https://storage.googleapis.com/ecowave/img/informations/article.png");
        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpointCreateInformation());
    }
    @Step("I receive valid HTTP response code 422")
    public void validateHttpResponseCode422() {

        restAssuredThat(response -> response.statusCode(422));
    }



    @Step("I set GET endpoints search information by id")
    public String setApiEndpointSearchInformationById(){

        return url + "/admin/informations/search?filter=Terbit";
    }

    @Step("I send GET HTTP request search information by id")
    public void sendGetHttpRequestSearchInformationById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchInformationById());
    }
    @Step("I set GET endpoints search unavailable information by id")
    public String setApiEndpointSearchUnavailableInformationById(){

        return url + "/admin/informations/search?search=djwndwp&filter=duwnd";
    }

    @Step("I send GET HTTP request search unavailable information by id")
    public void sendGetHttpRequestSearchUnavailableInformationById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchUnavailableInformationById());
    }



    @Step("I set DELETE endpoints information")
    public String setDeleteEndpointInformation(){
        return url + "/admin/informations/2c2b5c26-7546-4bfb-9054-bdc665c85c99";
    }

    @Step("I send DELETE HTTP request information")
    public void sendDeleteHttpRequestInformation(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointInformation());
    }
}
