package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class StatusOrderAndReview {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6InVzZXIxQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzEyOSwidXNlcl9pZCI6Mn0.v_l4ukJqYwkhBXcwl5Q3834e-iSUPsdTnCCSlyaa200";
    @Step("I set GET endpoints transactions")
    public String setApiEndpointTransactions(){

        return url + "/user/order";
    }

    @Step("I send GET HTTP request transactions")
    public void sendGetHttpRequestTransactions(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactions());
    }
    @Step("I set GET endpoints transactions belum dibayar")
    public String setApiEndpointTransactionsBelumDibayar(){

        return url + "/user/order?filter=Belum Bayar&page=1";
    }

    @Step("I send GET HTTP request transactions belum dibayar")
    public void sendGetHttpRequestTransactionsBelumDibayar(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsBelumDibayar());
    }
    @Step("I set GET endpoints transactions dikemas")
    public String setApiEndpointTransactionsDikemas(){

        return url + "/user/order?filter=Dikemas&page=1";
    }

    @Step("I send GET HTTP request transactions dikemas")
    public void sendGetHttpRequestTransactionsDikemas(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsDikemas());
    }
    @Step("I set GET endpoints transactions dikirim")
    public String setApiEndpointTransactionsDikirim(){

        return url + "/user/order?filter=Dikirim&page=1";
    }

    @Step("I send GET HTTP request transactions dikirim")
    public void sendGetHttpRequestTransactionsDikirim(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsDikirim());
    }
    @Step("I set GET endpoints transactions selesai")
    public String setApiEndpointTransactionsSelesai(){

        return url + "/user/order?filter=Selesai&page=1";
    }

    @Step("I send GET HTTP request transactions selesai")
    public void sendGetHttpRequestTransactionsSelesai(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsSelesai());
    }
    @Step("I set GET endpoints transactions dibatalkan")
    public String setApiEndpointTransactionsDibatalkan(){

        return url + "/user/order?filter=Dibatalkan&page=1";
    }

    @Step("I send GET HTTP request transactions dibatalkan")
    public void sendGetHttpRequestTransactionsDibatalkan(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsDibatalkan());
    }
    @Step("I set GET endpoints transactions invalid filter")
    public String setApiEndpointTransactionsInvalidFilter(){

        return url + "/user/order?filter=Invalid";
    }

    @Step("I send GET HTTP request transactions invalid filter")
    public void sendGetHttpRequestTransactionsInvalidFilter(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointTransactionsInvalidFilter());
    }
    @Step("I set GET endpoints transactions invalid token")
    public String setApiEndpointTransactionsInvalidToken(){

        return url + "/user/order?filter=Selesai&page=1";
    }

    @Step("I send GET HTTP request transactions invalid token")
    public void sendGetHttpRequestTransactionsInvalidToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer invalid")
                .when()
                .get(setApiEndpointTransactionsInvalidToken());
    }






    @Step("I set POST endpoints confirm order")
    public String setPostApiEndpointConfirmOrder() {
        return url + "/user/order/confirm";
    }

    @Step("I send POST HTTP request confirm order")
    public void sendPostHttpRequestConfirmOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("TransactionId", "eco22023061514070657");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }

    @Step("I send POST HTTP request confirm order invalid status")
    public void sendPostHttpRequestConfirmOrderInvalidStatus(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("TransactionId", "eco22023061514070654");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }
    @Step("I send POST HTTP request confirm order invalid token")
    public void sendPostHttpRequestConfirmOrderInvalidToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("TransactionId", "eco22023061514070657");

        SerenityRest.given().header("Authorization", "invalid token").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }

    @Step("I send POST HTTP request confirm order invalid id")
    public void sendPostHttpRequestConfirmOrderInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("TransactionId", "eco08596821351525");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }







    @Step("I set POST endpoints cancel order")
    public String setPostApiEndpointCancelOrder() {
        return url + "/user/order/cancel";
    }

    @Step("I send POST HTTP request cancel order")
    public void sendPostHttpRequestCancelOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("CanceledReason", "lupa ganti alamat - Testing");
        requestBody.put("TransactionId", "eco22023061514070654");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }
    @Step("I send POST HTTP request cancel order invalid status")
    public void sendPostHttpRequestCancelOrderInvalidStatus(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("CanceledReason", "lupa ganti alamat - Testing");
        requestBody.put("TransactionId", "eco22023061514070655");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }
    @Step("I send POST HTTP request cancel order invalid token")
    public void sendPostHttpRequestCancelOrderInvalidToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("CanceledReason", "lupa ganti alamat - Testing");
        requestBody.put("TransactionId", "eco22023062611540650");

        SerenityRest.given().header("Authorization", "Bearer invalid token").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }
    @Step("I send POST HTTP request cancel order invalid id")
    public void sendPostHttpRequestCancelOrderInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("CanceledReason", "lupa ganti alamat - Testing");
        requestBody.put("TransactionId", "eco22025151551540650");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointConfirmOrder());
    }
}
