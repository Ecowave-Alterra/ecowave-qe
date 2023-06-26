package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ECommerce {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6InVzZXIxQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzEyOSwidXNlcl9pZCI6Mn0.v_l4ukJqYwkhBXcwl5Q3834e-iSUPsdTnCCSlyaa200";
    @Step("I set GET endpoints ecommerce")
    public String setApiEndpointECommerce(){

        return url + "/user/ecommerce";
    }

    @Step("I send GET HTTP request ecommerce")
    public void sendGetHttpRequestECommerce(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointECommerce());
    }

    @Step("I set GET endpoints ecommerce exist filter")
    public String setApiEndpointECommerceExistFilter(){

        return url + "/user/ecommerce";
    }
    @Step("I send GET HTTP request ecommerce exist filter")
    public void sendGetHttpRequestECommerceExistFilter(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointECommerceExistFilter());
    }
    @Step("I set GET endpoints ecommerce not exist filter ")
    public String setApiEndpointECommerceNotExistFilter (){

        return url + "/user/ecommerce";
    }

    @Step("I send GET HTTP request ecommerce not exist filter ")
    public void sendGetHttpRequestECommerceNotExistFilter (){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointECommerceNotExistFilter());
    }
}
