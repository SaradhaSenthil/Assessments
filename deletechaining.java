package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deletechaining extends RestAssuredBase{
	@Test(dependsOnMethods="chaining.updatewithPutchaining.Updatewithstring")
	public void Delete()
	{
		
		//Delete request using the sys_id
		Response response = RestAssured.delete("/incident/"+sys_id);
		
		//Printing the status code
		System.out.println(response.getStatusCode());
		
		//Printing the response
		//response.prettyPrint();
	}
	

}
