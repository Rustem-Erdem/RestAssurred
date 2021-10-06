import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test031_POST_UPDATE {
    @Test
    public void test_1(){


        JSONObject request= new JSONObject();
        request.put("name","Rustem");
        request.put("job","SDET");
        System.out.println(request);
        System.out.println(request.toJSONString());//to see and compare


        given().
                header("Content-Type","application/json").//add this later
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();


    }
}

