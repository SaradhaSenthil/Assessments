package chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class RestAssuredBase {
	
	//global variable sys_id
	public static String sys_id;
	
	@BeforeMethod
	public void setup()
	{ 
		//url
		RestAssured.baseURI="https://dev60345.service-now.com/api/now/table";
		//Authentication using OAUTH
		RestAssured.authentication=RestAssured.oauth2("Bearer 0GEpeiRy6PQJ4PFJg2DJgBapuCgKG45HBBI9-1hUWmcjuxQXDUD7p9_4LvF0981mOnvUgdQRYJ66uYIjrEu_Nw");
	}

}
