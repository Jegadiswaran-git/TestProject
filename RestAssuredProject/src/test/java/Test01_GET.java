import org.testng.Assert;
import org.testng.annotations.Test;

import com.mp.functionlibrary.Commonmethod;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test01_GET {
	
	
	@Test
	void login()
	{
		
		
		Response res = given()
				.header("x-api-key","oBDb4xNRjO24xuxGFxZA95VbkHZ1B35z2zhm5F0A")
				.when()
				.get ("https://api.passport.stg.idp.com/v1/passport-bff-event/customer_profile/findByEmailId?StudentPrimaryEmailID=cptbluuid3@yopmail.com").then().
				extract().response();
		System.out.println(res.getBody());   
		System.out.println(res.getStatusCode());
		
		int statusCode = res.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		String api_response = res.asString();
		System.out.println(api_response);
		if(api_response.contains("cptbluuid3@yopmail.com"))
		{
			System.out.println("API Contains that string");
		}
		else
		{
			System.out.println("API does not contains that string");
		}
		
		
	}
	
	
	
//	@Test
//	void test_01()
//	{
//		
//		
//		
//		
//		
//		Response response = get("https://api.passport.stg.idp.com/v1/passport-bff-event/customer_profile/findByEmailId?StudentPrimaryEmailID=serina338.xxxx@phgmail.com");
//		System.out.println(response.asString());
//		System.out.println(response.getBody());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getTime());
//		
//		int statusCode = response.statusCode();
//		Assert.assertEquals(statusCode, 200);
//		
//		
//	}
//	
//	@Test
//	void test_02()
//	{
//	 given().get("https://api.passport.stg.idp.com/v1/passport-bff-event/customer_profile/findByEmailId?StudentPrimaryEmailID=serina338.xxxx@phgmail.com").
//	 
//	 then().body(containsString("https://ielts.stg.idp.com/pakistan/about/news-and-articles/article-ielts-speaking-ai-vs-face-to-face"));
//	 
//	}

}
