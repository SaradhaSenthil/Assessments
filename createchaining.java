package chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class createchaining extends RestAssuredBase {
	@Test
	public void createwithfile()
	
	{  	
		//Body of post from file 
		File fileName=new File("./src/test/resources/create.json");
		
		//post request
		Response response = RestAssured.given().contentType("application/json")
				.when().body(fileName)
				.post("/incident");
		
		//printing the response
		response.prettyPrint();
		
		//printing the status code
		System.out.println(response.statusCode());
		
		//getting the sys_id
		JsonPath Path = response.jsonPath();
	    sys_id = Path.get("result.sys_id");
		System.out.println(sys_id);
		
	}

}
