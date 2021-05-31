package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {
    // Set base URL
    final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {
        // Import JSON file
        FileInputStream inputJSON = new FileInputStream("src/activities/userinfo.json");
        
        String reqBody=new String(inputJSON.readAllBytes());
        // Read JSON file as String
        
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .body(reqBody) // Pass request body from file
            .when().post(ROOT_URI); // Send POST request

        inputJSON.close();

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("1987"));
    }
    
    @Test(priority=2)
    public void getUserInfo() {
        // Import JSON file to write to
        File outputJSON = new File("src/activities/userGETResponse.json");

        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .pathParam("username", "ramdha") // Pass request body from file
            .when().get(ROOT_URI + "/{username}"); // Send POST request
        
        // Get response body
        String resBody = response.getBody().asPrettyString();

        try {
            // Create JSON file
            outputJSON.createNewFile();
            // Write response body to external file
            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }
        
        // Assertion
        response.then().body("id", equalTo(1987));
        response.then().body("username", equalTo("ramdha"));
        response.then().body("firstName", equalTo("dha"));
        response.then().body("lastName", equalTo("ram"));
        response.then().body("email", equalTo("tell2ram@gmail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9487926632"));
    }
    
    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .pathParam("username", "ramdha") // Add path parameter
            .when().delete(ROOT_URI + "/{username}"); // Send POST request

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("ramdha"));
    }
}