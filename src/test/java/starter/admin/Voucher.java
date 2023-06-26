package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Voucher {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";
    @Step("I set GET endpoints voucher")
    public String setApiEndpointVoucher(){

        return url + "/admin/vouchers";
    }

    @Step("I send GET HTTP request voucher")
    public void sendGetHttpRequestVoucher(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointVoucher());
    }
    @Step("I send GET HTTP request voucher without token")
    public void sendGetHttpRequestVoucherWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointVoucher());
    }




    @Step("I set GET endpoints voucher by id")
    public String setApiEndpointVoucherById(){

        return url + "/admin/vouchers/8275657f-bc1f-4040-a156-f9559639a404";
    }

    @Step("I send GET HTTP request voucher by id")
    public void sendGetHttpRequestVoucherById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointVoucherById());
    }
    @Step("I set GET endpoints voucher by wrong id")
    public String setApiEndpointVoucherByWrongId(){

        return url + "/admin/vouchers/637022985295";
    }

    @Step("I send GET HTTP request voucher by wrong id")
    public void sendGetHttpRequestVoucherByWrongId(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointVoucherByWrongId());
    }
    @Step("I receive valid HTTP response code 500")
    public void validateHttpResponseCode500() {

        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I send GET HTTP request voucher by id without token")
    public void sendGetHttpRequestVoucherByIdWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointVoucherById());
    }



    @Step("I set POST endpoints create voucher")
    public String setApiEndpointCreateVoucher(){

        return url + "/admin/vouchers";
    }
    @Step("I send POST HTTP request create voucher")
    public void sendPostHttpRequestCreateVoucher(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("VoucherTypeId", 1);
        requestBody.put("StartDate", "20 January 2000");
        requestBody.put("EndDate", "30 January 2000");
        requestBody.put("MinimumPurchase", 100000);
        requestBody.put("MaximumDiscount", 10000);
        requestBody.put("DiscountPercent", 10);
        requestBody.put("ClaimedCount", 100);
        requestBody.put("MaxClaimLimit", 2);

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").post(setApiEndpointCreateVoucher());
    }
    @Step("I send POST HTTP request create voucher incomplete data")
    public void sendPostHttpRequestCreateVoucherIncompleteData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("VoucherTypeId", 1);
        requestBody.put("StartDate", "20 January 2000");
        requestBody.put("EndDate", "30 January 2000");
        requestBody.put("MinimumPurchase", 100000);
        requestBody.put("MaximumDiscount", 10000);
        requestBody.put("DiscountPercent", 10);
        requestBody.put("ClaimedCount", 100);
        requestBody.put("MaxClaimLimit", 2);

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").post(setApiEndpointCreateVoucher());
    }
    @Step("I send POST HTTP request create voucher without token")
    public void sendPostHttpRequestCreateVoucherWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("VoucherTypeId", 1);
        requestBody.put("StartDate", "20 January 2000");
        requestBody.put("EndDate", "30 January 2000");
        requestBody.put("MinimumPurchase", 100000);
        requestBody.put("MaximumDiscount", 10000);
        requestBody.put("DiscountPercent", 10);
        requestBody.put("ClaimedCount", 100);
        requestBody.put("MaxClaimLimit", 2);

        SerenityRest.given().header("Authorization", "Bearer notoken").header("Content-Type", "application/json").post(setApiEndpointCreateVoucher());
    }




    @Step("I set PUT endpoints voucher")
    public String setPutEndpointVoucher(){
        return url + "/admin/vouchers/6350b3c6-832a-471e-858c-78aaf751c36c";
    }

    @Step("I send PUT HTTP request voucher")
    public void sendPutHttpRequestVoucher(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("StartDate", "2 January 2010");
        requestBody.put("EndDate", "10 February 2010");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointVoucher());
    }
    @Step("I set PUT endpoints voucher incomplete Data")
    public String setPutEndpointVoucherIncompleteData(){
        return url + "/admin/vouchers/6350b3c6-832a-471e-858c-78aaf751c36c";
    }

    @Step("I send PUT HTTP request voucher incomplete data")
    public void sendPutHttpRequestVoucherIncompleteData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("StartDate", "");
        requestBody.put("EndDate", "");

        SerenityRest.given().header("Authorization", token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointVoucherIncompleteData());
    }
    @Step("I send PUT HTTP request voucher without token")
    public void sendPutHttpRequestVoucherWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("StartDate", "2 January 2010");
        requestBody.put("EndDate", "10 February 2010");

        SerenityRest.given().header("Authorization", "bearer notoken").header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpointVoucher());
    }




    @Step("I set DELETE endpoints voucher")
    public String setDeleteEndpointVoucher(){
        return url + "/admin/vouchers/9700d95e-c111-4239-a617-15a182d4f731";
    }

    @Step("I send DELETE HTTP request voucher")
    public void sendDeleteHttpRequestVoucher(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointVoucher());
    }
    @Step("I set DELETE endpoints voucher by wrong id")
    public String setDeleteEndpointVoucherByWrongId(){
        return url + "/admin/vouchers/043-0539jbfoei-wrongid";
    }

    @Step("I send DELETE HTTP request voucher by wrong id")
    public void sendDeleteHttpRequestVoucherByWrongId(){
        SerenityRest.given()
                .header("Authorization", token)
                .delete(setDeleteEndpointVoucherByWrongId());
    }
    @Step("I send DELETE HTTP request voucher without token")
    public void sendDeleteHttpRequestVoucherWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Barear notoken")
                .delete(setDeleteEndpointVoucher());
    }
}
