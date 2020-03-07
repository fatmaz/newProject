package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITests {
	@Test
 public void getAllJobTitle() {
	 Response response=RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5NDUyMzMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzA2MDQzMywidXNlcklkIjoiMTA4In0.y2O7M3V35x3e7YPS7NLAW5P2J3Kjv74C1ImYF_uhWYM")
			 
	 .when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");
	 response.prettyPrint();
		
		  int actualResponseCode = response.getStatusCode();
		 System.out.println(actualResponseCode);
		
 }
	@Test
	public void getOneEmployee() {
		Response response=RestAssured.given().param("employee_id", "3562").contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0Njc1NTQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4Mjc1NCwidXNlcklkIjoiMTAxIn0.1O4h2oMoRhaNHdBgM67tn7UFScOOsgFcmm-07DavW6M")
.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
response.prettyPrint();
	}
	
	//task
	@Test
	public void getAllEmployees() {
		Response response=RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0Njc1NTQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4Mjc1NCwidXNlcklkIjoiMTAxIn0.1O4h2oMoRhaNHdBgM67tn7UFScOOsgFcmm-07DavW6M")
	.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");
		response.prettyPrint();
	}
	@Test
	public void createEmployee() {
		Response response=RestAssured.given().contentType("application/json").header("Authorization"," Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQzNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTU1MCwidXNlcklkIjoiMTAxIn0.hTws1t3c3jTUFYMfIWt30VF0BszWXNyYyRbeFnwbW3c")
				
		.param("emp_firstname","05501A")
		.param("emp_lastname","SYNTAXINSTRUCTOR")
		.param("emp_middlename","API")
		.param("emp_gender","2")
		.param("emp_birthday", "1991-02-19")
		.param("emp_status","Employee")
	    .param("emp_job_title", "Developer")
		.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
		
		/*
		 * { "emp_firstname": "05501A", "emp_lastname": "SYNTAXINSTRUCTOR",
		 * "emp_middle_name": "API", "emp_gender": 2, "emp_birthday": "1991-02-19",
		 * "emp_status": "Employee", "emp_job_title": "Developer" }
		 */
		
					response.prettyPrint();
		response.statusCode();
		int actualStatusCode=response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);
		
	}
}
