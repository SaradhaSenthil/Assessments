package chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class updatewithPutchaining extends RestAssuredBase{
	@Test(dependsOnMethods="chaining.createchaining.createwithfile")
	public void Updatewithstring()
	{   			
		//Put request
		Response response = RestAssured.given().contentType("application/json")
				.when().body("{\r\n"
						+ "    \"short_description\": \"Updated via rest\",\r\n"
						+ "    \"description\": \"Description added via rest\"\r\n"
						+ "}")
				.put("/incident/"+sys_id);
		
		System.out.println(sys_id);
		
		response.prettyPrint();
		
		//Json schema validation of the put response and schema stored in File
		
		File fileName=new File("./src/test/resources/putschemavalidation.json");
		response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(fileName));
		System.out.println("json schema validated");
}
}
