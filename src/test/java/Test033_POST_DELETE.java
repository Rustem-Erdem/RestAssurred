import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

public class Test033_POST_DELETE {
    @Test
    public void test_1(){



                when().
                delete("https://reqres.in/api/users/2").
                then().statusCode(204).log().all();


    }
}
