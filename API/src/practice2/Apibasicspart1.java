package practice2;

// need to write manually when using given
import static io.restassured.RestAssured.given;
// Neewd to write Manuall when using equal to 
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Apibasicspart1
{
    @Test
	public static void main(String[] args) 
	
	//given = All input details 
	//when = Submit the API
	//Then = validate the reswponse
	
{
	       RestAssured.baseURI="https://rahulshettyacademy.com";
	       
	       // Given means all the details that are to be inserted Like guery parameters , header and body .
	       
	       given().log().all().queryParam("Key", "qaclick123").header("Content-Type", "application/json")
	       .body("{\r\n"
	       		+ "  \"location\": {\r\n"
	       		+ "    \"lat\": -38.383494,\r\n"
	       		+ "    \"lng\": 33.427362\r\n"
	       		+ "  },\r\n"
	       		+ "  \"accuracy\": 50,\r\n"
	       		+ "  \"name\": \"Frontline house\",\r\n"
	       		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
	       		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
	       		+ "  \"types\": [\r\n"
	       		+ "    \"shoe park\",\r\n"
	       		+ "    \"shop\"\r\n"
	       		+ "  ],\r\n"
	       		+ "  \"website\": \"http://google.com\",\r\n"
	       		+ "  \"language\": \"French-IN\"\r\n"
	       		+ "}\r\n"
	       		+ "\r\n"     // In when methods we will send https name and resources 
	       		             //Then means what will you get or we will verify the response
	       		+ "").when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
	              .body("scope",equalTo("APP"));
	       

	}

}
