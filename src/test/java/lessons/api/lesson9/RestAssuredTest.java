package lessons.api.lesson9;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class RestAssuredTest {
    public static final String BASE_URL = "https://reqres.in/";

    @Test
    public void test() {

        //______________________________GET____________________________
//        Response response = RestAssured.get(BASE_URL + "api/users?page=2");
//        System.out.println(response.asString());
//        System.out.println(response.getBody().asString());
//
//        System.out.println(response.getStatusCode());

//        given()
//                .get(BASE_URL +"api/users?page=2")
//                .then()
//                .statusCode(200)
//                .body("data.id[0]", equalTo(7));
//
//        given()
//                .get(BASE_URL +"api/users?page=2")
//                .then()
//                .statusCode(200)
//                .log().body();

//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get(BASE_URL + "api/users?page=2")
//                .then()
//                .extract().response();
//
//        Assert.assertEquals(200, response.getStatusCode());
//        Assert.assertEquals("Lindsay", response.jsonPath().getString("data.first_name[1]"));


//        _____________________________________POST_________________________________________

//        Map<String, String> map = new HashMap<>();
//
//        map.put("name", "Marian");
//        map.put("job", "aqa");

        JSONObject request = new JSONObject();
        request.put("name", "Marian");
        request.put("job", "aqa");
//        given()
//                .header("Content-Type", "application/json")
//                .accept(ContentType.JSON)
//                .body(request.toJSONString())
//                .when()
//                .post(BASE_URL + "api/users")
//                .then()
//                .statusCode(201).log().body();

//        ______________________________________________PUT_______________________________________________

//        given()
//                .header("Content-Type", "application/json")
//                .accept(ContentType.JSON)
//                .body(request.toJSONString())
//                .when()
//                .put(BASE_URL + "api/users/2")
//                .then()
//                .statusCode(200).log().body();

//        __________________________________________DELETE__________________________________________________

        when()
                .delete(BASE_URL + "api/users/2")
                .then()
                .statusCode(204).log().all();
        }
}
