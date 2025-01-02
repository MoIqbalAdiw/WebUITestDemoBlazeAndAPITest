package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type","application/json")
                .header("Accept","application/json");
    }
    public static Response getListUsers(String endpoint) {
//        System.out.println("endpoint yang di lempar: " + endpoint);
        setupHeaders();
        return request.when().get(endpoint);
    }
    public static Response postCreateUser(String endpoint){
        String email = generateRandomEmail();
        String nameDepan = "Moh";
        String namaBelakang = "Iqbal";
        JSONObject payLoad = new JSONObject();
        payLoad.put("first_name", nameDepan);
        payLoad.put("last_name", namaBelakang);
        payLoad.put("email", email);

        setupHeaders();
        return request.body(payLoad.toString()).when().post(endpoint);
    }

    public static Response deleteUser(String endpoint) {
        setupHeaders();
//        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(endpoint);
    }
}
