package tests;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class testExamples {
    @Test
    // public void test(){
//
//        Response response = get("https://reqres.in/api/users?page=2");
//  System.out.println(response.getStatusCode());
//       //System.out.println(response.getHeaders());
//
//        //System.out.println( response.getBody().asPrettyString());
//       // System.out.println( response.getBody().asString());
//        int actual= response.getStatusCode();
//        Assert.assertEquals(actual, 200 );
//    }
    public void test_2() {
        JSONObject req = new JSONObject();
       // given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }
}

