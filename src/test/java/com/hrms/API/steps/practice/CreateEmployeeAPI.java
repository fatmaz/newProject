package com.hrms.API.steps.practice;


	import com.hrms.utils.CommonMethods;

    import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
	public class CreateEmployeeAPI {
		private static RequestSpecification request;
		private Response response;
		@Given("user call createEmployee API")
		public void user_call_createEmployee_API() {
		    // Write code here that turns the phrase above into concrete actions
		request=given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
		request.body(CommonMethods.readJson("C:\\Users\\Fatma Cevik\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\JSONFlies\\createEmployee.JSON"));
		}
		@When("user retrieves response")
		public void user_retrieves_response() {
		    // Write code here that turns the phrase above into concrete actions
			response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
			System.out.println(response.prettyPrint());
		}
		@Then("status code is {int}")
		public void status_code_is(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			 response.then().assertThat().statusCode(int1);
		}
		@Then("user validates employee is created")
		public void user_validates_employee_is_created() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(response.prettyPrint());
	
		}
}







