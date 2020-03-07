package com.hrms.utils;

public class APIConstants {
public static final String CREATE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/createEmployee.php";
	
	
public static final String CREATE_EMPLOYEE_JSON = System.getProperty("user.dir")+ "\\src\\test\\resources\\JSONFlies\\createEmployee.json";

public static final String GENERATE_TOKEN_JSON = System.getProperty("user.dir")+ "\\src\\test\\resources\\JSONFlies\\generateToken.json";
public static final String UPDATE_URI="http://54.167.125.15/syntaxapi/api/updateEmployee.php";
public static final String GET_ONE_URI="http://54.167.125.15/syntaxapi/api/getOneEmployee.php";
public static final String DELETE_URI="http://54.167.125.15/syntaxapi/api/deleteEmployee.php";
public static final String GET_ALL_EMPLOYEE_URI="http://54.167.125.15/syntaxapi/api/getAllEmployees.php";
public static final String GET_ALL_JOPTITLE_URI="http://54.167.125.15/syntaxapi/api/jobTitle.php";
public static final String GET_ALL_EMPLOYEE_STATUS_URI="http://54.167.125.15/syntaxapi/api/employeeStatus.php";
}





