import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Test03_POST_CREATE {
    @Test
    public void test_1(){

//        Map<String,Object> map =new HashMap<String,Object>();
//        map.put("name","Rustem");
//        map.put("job","SDET");
//        System.out.println(map);
//to convert the "map" to json language insert "map" below in object(from json simple)
               JSONObject request= new JSONObject();
        request.put("name","Rustem");
        request.put("job","SDET");
        System.out.println(request);
        System.out.println(request.toJSONString());//to see and compare


        given().
                header("Content-Type","application/json").//add this later
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201);


    }
}
