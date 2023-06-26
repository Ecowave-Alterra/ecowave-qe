package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Product {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";
    @Step("I set GET endpoints product")
    public String setApiEndpointProduct(){

        return url + "/admin/products";
    }

    @Step("I send GET HTTP request product")
    public void sendGetHttpRequestProduct(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointProduct());
    }
    @Step("I send GET HTTP request product without token")
    public void sendGetHttpRequestProductWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointProduct());
    }
    @Step("I receive valid HTTP response code 401")
    public void validateHttpResponseCode401() {

        restAssuredThat(response -> response.statusCode(401));
    }





    @Step("I set GET endpoints product by id")
    public String setApiEndpointProductById(){

        return url + "/admin/products/f71ff306-ebd7-45e5-9607-5b908dd1c423";
    }

    @Step("I send GET HTTP request product by id")
    public void sendGetHttpRequestProductById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointProductById());
    }
    @Step("I set GET endpoints product by wrong id")
    public String setApiEndpointProductByWrongId(){

        return url + "/admin/products/f77f306-yud7-46e5-9607-58608dd1c423";
    }

    @Step("I send GET HTTP request product by wrong id")
    public void sendGetHttpRequestProductByWrongId(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointProductByWrongId());
    }
    @Step("I send GET HTTP request product by id without token")
    public void sendGetHttpRequestProductByIdWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointProductById());
    }




    @Step("I set GET endpoints search product")
    public String setApiEndpointSearchProduct(){

        return url + "/admin/products/search?search=perabot&filter=";
    }

    @Step("I send GET HTTP request search product")
    public void sendGetHttpRequestSearchProduct() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchProduct());
    }
    @Step("I set GET endpoints search not exists product")
    public String setApiEndpointSearchNotExistsProduct(){

        return url + "/admin/products/search?search=notexists&filter=";
    }

    @Step("I send GET HTTP request search not exists product")
    public void sendGetHttpRequestSearchNotExistsProduct() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchNotExistsProduct());
    }
    @Step("I send GET HTTP request search product without token")
    public void sendGetHttpRequestSearchProductWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointSearchProduct());
    }
    @Step("I set GET endpoints search product by filter")
    public String setApiEndpointSearchProductByFilter(){

        return url + "/admin/products/search?search=&filter=tersedia";
    }

    @Step("I send GET HTTP request search product by filter")
    public void sendGetHttpRequestSearchProductByFilter() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchProductByFilter());
    }
    @Step("I set GET endpoints search not exists product by filter")
    public String setApiEndpointSearchNotExistsProductByFilter(){

        return url + "/admin/products/search?search=&filter=notexists";
    }

    @Step("I send GET HTTP request search not exists product by filter")
    public void sendGetHttpRequestSearchNotExistsProductByFilter() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchNotExistsProductByFilter());
    }





    @Step("I set POST endpoints create product")
    public String setApiEndpointCreateProduct(){

        return url + "/admin/products";
    }
    @Step("I send POST HTTP request create product")
    public void sendPostHttpRequestCreateProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "1");
        requestBody.put("Name", "product testing");
        requestBody.put("Stock", "10");
        requestBody.put("Weight", "100");
        requestBody.put("Price", "10000");
        requestBody.put("Description", "Product Testing");
        requestBody.put("PhotoContentUrl1", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl2", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl3", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl4", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl5", new File("ecowave-api-automation/bahan/LOGO.png"));
        SerenityRest.given().header("Authorization", token).header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>").post(setApiEndpointCreateProduct());
    }
    @Step("I send POST HTTP request create product incomplete data")
    public void sendPostHttpRequestCreateProductIncompleteData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "");
        requestBody.put("Name", "");
        requestBody.put("Stock", "");
        requestBody.put("Weight", "");
        requestBody.put("Price", "");
        requestBody.put("Description", "");
        requestBody.put("PhotoContentUrl1", new File(""));
        requestBody.put("PhotoContentUrl2", new File(""));
        requestBody.put("PhotoContentUrl3", new File(""));
        requestBody.put("PhotoContentUrl4", new File(""));
        requestBody.put("PhotoContentUrl5", new File(""));
        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").post(setApiEndpointCreateProduct());
    }
    @Step("I send POST HTTP request create product without token")
    public void sendPostHttpRequestCreateProductWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "1");
        requestBody.put("Name", "product testing");
        requestBody.put("Stock", "10");
        requestBody.put("Weight", "100");
        requestBody.put("Price", "10000");
        requestBody.put("Description", "Product Testing");
        requestBody.put("PhotoContentUrl1", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl2", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl3", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl4", new File("ecowave-api-automation/bahan/LOGO.png"));
        requestBody.put("PhotoContentUrl5", new File("ecowave-api-automation/bahan/LOGO.png"));
        SerenityRest.given().header("Authorization", "Bearer ").header("Content-Type", "multipart/form-data; boundary=<calculated when request is sent>").post(setApiEndpointCreateProduct());
    }




    @Step("I set DELETE endpoints product")
    public String setDeleteEndpointProduct(){
        return url + "/admin/products/1626a4a3-1103-43f3-b41c-a63d6c0dea1b";
    }

    @Step("I send DELETE HTTP request product")
    public void sendDeleteHttpRequestProduct(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointProduct());
    }
    @Step("I set DELETE endpoints product by wrong id")
    public String setDeleteEndpointProductByWrongId(){
        return url + "/admin/products/1626w4a3-1103-43x7-bg4u1c-a63d6r84dea1b";
    }

    @Step("I send DELETE HTTP request product by wrong id")
    public void sendDeleteHttpRequestProductByWrongId(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointProductByWrongId());
    }
    @Step("I send DELETE HTTP request product without token")
    public void sendDeleteHttpRequestProductWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Barear notoken")
                .delete(setDeleteEndpointProduct());
    }



    @Step("I set PUT endpoints product")
    public String setPutEndpointProduct(){
        return url + "/admin/products/d081d6bb-e0dc-429c-a5b3-edc5567d4cda";
    }

    @Step("I send PUT HTTP request product")
    public void sendPutHttpRequestProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "1");
        requestBody.put("Name", "product testing");
        requestBody.put("Stock", "10");
        requestBody.put("Weight", "100");
        requestBody.put("Price", "10000");
        requestBody.put("Description", "Product Testing");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointProduct());
    }
    @Step("I set PUT endpoints product incomplete Data")
    public String setPutEndpointProductIncompleteData(){
        return url + "/admin/products/d081d6bb-e0dc-429c-a5b3-edc5567d4cda";
    }

    @Step("I send PUT HTTP request product incomplete data")
    public void sendPutHttpRequestProductIncompleteData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "1");
        requestBody.put("Name", "");
        requestBody.put("Stock", "");
        requestBody.put("Weight", "100");
        requestBody.put("Price", "10000");
        requestBody.put("Description", "Product Testing");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointProductIncompleteData());
    }
    @Step("I send PUT HTTP request product without token")
    public void sendPutHttpRequestProductWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ProductCategoryId", "1");
        requestBody.put("Name", "testing lagi");
        requestBody.put("Stock", "10");
        requestBody.put("Weight", "100");
        requestBody.put("Price", "10000");
        requestBody.put("Description", "Product Testing");

        SerenityRest.given().header("Authorization", "bearer notoken").header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointProductIncompleteData());
    }
}
