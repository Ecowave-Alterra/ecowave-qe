package starter.admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class Review {
    protected static String url = "https://ecowave-h64wmjjkza-uc.a.run.app";
    protected static String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTY4Nzg3NzAxNSwidXNlcl9pZCI6MX0.t7THuVFdiHavP9iHcwAF0gqrP2xOZ2vjo50c1kA2n2E";
    @Step("I set GET endpoints review")
    public String setApiEndpointReview(){

        return url + "/admin/reviews";
    }

    @Step("I send GET HTTP request review")
    public void sendGetHttpRequestReview(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointReview());
    }
    @Step("I send GET HTTP request review without token")
    public void sendGetHttpRequestReviewWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointReview());
    }
    @Step("I set GET endpoints review by page number")
    public String setApiEndpointReviewByPageNumber(){

        return url + "/admin/reviews?page=2";
    }
    @Step("I send GET HTTP request review by page number")
    public void sendGetHttpRequestReviewByPageNumber(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointReviewByPageNumber());
    }




    @Step("I set GET endpoints review by id")
    public String setApiEndpointReviewById(){

        return url + "/admin/reviews/00338de6-5f1a-4fc0-90e2-4b0382afa1c2";
    }

    @Step("I send GET HTTP request review by id")
    public void sendGetHttpRequestReviewById(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointReviewById());
    }
    @Step("I send GET HTTP request review by id without token")
    public void sendGetHttpRequestReviewByIdWithoutToken(){
        SerenityRest.given()
                .header("Authorization", "Bearer ")
                .when()
                .get(setApiEndpointReview());
    }
    @Step("I set GET endpoints review by invalid id")
    public String setApiEndpointReviewByInvalidId(){

        return url + "/admin/reviews/idkosong";
    }

    @Step("I send GET HTTP request review by invalid id")
    public void sendGetHttpRequestReviewByInvalidId(){
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setApiEndpointReviewByInvalidId());
    }
}
