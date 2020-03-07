package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.Assert;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*Given user calls getAllEmployee API
When User retrieves response for getAllEmployee API
Then status code is 200 for getAllEmployee API
Then user validates created Allemployees*/
public class GETAllEmployee {
	private Response response;
	private static RequestSpecification request;
	@Given("user calls getAllEmployee API")
	public void user_calls_getAllEmployee_API() {
		
		request = given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("User retrieves response for getAllEmployee API")
	public void user_retrieves_response_for_getAllEmployee_API() {
		
		response = request.when().get(APIConstants.GET_ALL_EMPLOYEE_URI);
		response.prettyPrint();
		
	}

@Then("status code is {int} for getAllEmployee API")
	public void status_code_is_for_getAllEmployee_API(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions  
	}
	@Then("user validates created Allemployees")
	public void user_validates_created_Allemployees() {
	    // Write code here that turns the phrase above into concrete actions 
		
		List<String> emplist=response.jsonPath().getList("Employee");
		System.out.println("Total employee is "+emplist.size());
		Assert.assertEquals(2767, emplist.size());
	}
}

