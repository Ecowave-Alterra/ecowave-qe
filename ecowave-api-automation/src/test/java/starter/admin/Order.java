package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Order {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";
    @Step("I set GET endpoints order")
    public String setApiEndpointOrder(){

        return url + "/admin/orders";
    }

    @Step("I send GET HTTP request order")
    public void sendGetHttpRequestOrder(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrder());
    }
    @Step("I send GET HTTP request order without token")
    public void sendGetHttpRequestOrderWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointOrder());
    }

    @Step("I set GET endpoints order by page size")
    public String setApiEndpointOrderByPageSize(){

        return url + "/admin/orders?pageSize=2";
    }

    @Step("I send GET HTTP request order by page size")
    public void sendGetHttpRequestOrderByPageSize(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrderByPageSize());
    }
    @Step("I set GET endpoints order by page number")
    public String setApiEndpointOrderByPageNumber(){

        return url + "/admin/orders?pageNumber=2";
    }

    @Step("I send GET HTTP request order by page number")
    public void sendGetHttpRequestOrderByPageNumber(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrderByPageNumber());
    }
    @Step("I set GET endpoints order by status")
    public String setApiEndpointOrderByStatus(){

        return url + "/admin/orders?status=Delivered";
    }

    @Step("I send GET HTTP request order by status")
    public void sendGetHttpRequestOrderByStatus(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrderByStatus());
    }


    @Step("I set GET endpoints order by id")
    public String setApiEndpointOrderById(){

        return url + "/admin/orders/eco22023061514070654";
    }

    @Step("I send GET HTTP request order by id")
    public void sendGetHttpRequestOrderById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrderById());
    }
    @Step("I send GET HTTP request order by id without token")
    public void sendGetHttpRequestOrderByIdWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointOrder());
    }
    @Step("I set GET endpoints order by invalid id")
    public String setApiEndpointOrderByInvalidId(){

        return url + "/admin/orders/22023061514070654";
    }

    @Step("I send GET HTTP request order by invalid id")
    public void sendGetHttpRequestOrderByInvalidId(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointOrderByInvalidId());
    }





    @Step("I set PUT endpoints order")
    public String setPutEndpointOrder(){
        return url + "eco22023061514070658";
    }

    @Step("I send PUT HTTP request order")
    public void sendPutHttpRequestOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ReceiptNumber", "jne516541255511");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointOrder());
    }
    @Step("I send PUT HTTP invalid request order")
    public void sendPutHttpInvalidRequestOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Receiptkuub", "12121121");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointOrder());
    }
    @Step("I set PUT endpoints order invalid id")
    public String setPutEndpointOrderInvalidId(){
        return url + "/admin/orders/invalidid";
    }

    @Step("I send PUT HTTP request order invalid id")
    public void sendPutHttpRequestOrderInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ReceiptNumber", "12121121");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointOrderInvalidId());
    }
    @Step("I send PUT HTTP request order invalid token")
    public void sendPutHttpRequestOrderInvalidToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("ReceiptNumber", "12121121");

        SerenityRest.given().header("Authorization", "81536581351681").header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointOrderInvalidId());
    }
}
