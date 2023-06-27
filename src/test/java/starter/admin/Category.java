package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

public class Category {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";
    @Step("I set GET endpoints product category")
    public String setApiEndpointProductCategory(){

        return url + "/admin/products/category";
    }

    @Step("I send GET HTTP request product category")
    public void sendGetHttpRequestProductCategory(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointProductCategory());
    }
    @Step("I send GET HTTP request product category without token")
    public void sendGetHttpRequestProductCategoryWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointProductCategory());
    }



//    @Step("I set POST endpoints create product category")
//    public String setApiEndpointCreateProductCategory(){
//        return url + "admin/products/category";
//    }
//    @Step("I send POST HTTP request create product category")
//    public void sendPostHttpRequestCreateProductCategory(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("Category", "test2");
//
//        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpointCreateProductCategory());
//    }
//    @Step("I send POST HTTP request create product category incomplete data")
//    public void sendPostHttpRequestCreateProductCategoryIncompleteData(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("category", "");
//
//        SerenityRest.given().header("Authorization", token)
//                .header("Content-Type", "application/json")
//                .body(requestBody.toJSONString())
//                .post(setApiEndpointCreateProductCategory());
//    }
//    @Step("I send POST HTTP request create product category without token")
//    public void sendPostHttpRequestCreateProductCategoryWithoutToken(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("category", "TestNoToken");
//
//        SerenityRest.given().header("Authorization", "Bearer notoken")
//                .header("Content-Type", "application/json")
//                .body(requestBody.toJSONString())
//                .post(setApiEndpointCreateProductCategory());
//    }







    @Step("I set PUT endpoints category")
    public String setPutEndpointCategory(){
        return url + "/admin/products/category/14";
    }

    @Step("I send PUT HTTP request category")
    public void sendPutHttpRequestCategory(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Category", "Rubah");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointCategory());
    }
    @Step("I set PUT endpoints category incomplete Data")
    public String setPutEndpointCategoryIncompleteData(){
        return url + "/admin/products/category/14";
    }

    @Step("I send PUT HTTP request category incomplete data")
    public void sendPutHttpRequestCategoryIncompleteData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Category", "");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointCategoryIncompleteData());
    }
    @Step("I send PUT HTTP request category without token")
    public void sendPutHttpRequestCategoryWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Category", "Change2");

        SerenityRest.given().header("Authorization", "bearer notoken").header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointCategoryIncompleteData());
    }




    @Step("I set DELETE endpoints category")
    public String setDeleteEndpointCategory(){
        return url + "/admin/products/category/18";
    }

    @Step("I send DELETE HTTP request category")
    public void sendDeleteHttpRequestCategory(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointCategory());
    }
    @Step("I set DELETE endpoints category by wrong id")
    public String setDeleteEndpointCategoryByWrongId(){
        return url + "/admin/products/category/13598";
    }

    @Step("I send DELETE HTTP request category by wrong id")
    public void sendDeleteHttpRequestCategoryByWrongId(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointCategoryByWrongId());
    }
    @Step("I send DELETE HTTP request category without token")
    public void sendDeleteHttpRequestCategoryWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Barear notoken")
                .delete(setDeleteEndpointCategory());
    }




    @Step("I set GET endpoints search category")
    public String setApiEndpointSearchCategory(){

        return url + "/admin/products/category/search?name=perabot&page=";
    }

    @Step("I send GET HTTP request search category")
    public void sendGetHttpRequestSearchCategory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchCategory());
    }
    @Step("I set GET endpoints search not exists category")
    public String setApiEndpointSearchNotExistsCategory(){

        return url + "/admin/products/category/search?name=bukankategori&page=";
    }

    @Step("I send GET HTTP request search not exists category")
    public void sendGetHttpRequestSearchNotExistsCategory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchNotExistsCategory());
    }
    @Step("I send GET HTTP request search category without token")
    public void sendGetHttpRequestSearchCategoryWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointSearchCategory());
    }
    @Step("I set GET endpoints search category by page number")
    public String setApiEndpointSearchCategoryByPageNumber(){

        return url + "/admin/products/category/search?name=&page=1";
    }

    @Step("I send GET HTTP request search category by page number")
    public void sendGetHttpRequestSearchCategoryByPageNumber() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchCategoryByPageNumber());
    }
    @Step("I set GET endpoints search not exists category by page number")
    public String setApiEndpointSearchNotExistsCategoryByPageNumber(){

        return url + "/admin/products/category/search?name=&page=50";
    }

    @Step("I send GET HTTP request search not exists category by page number")
    public void sendGetHttpRequestSearchNotExistsCategoryByPageNumber() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointSearchNotExistsCategoryByPageNumber());
    }
}
