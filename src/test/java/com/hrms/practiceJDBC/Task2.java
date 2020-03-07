package com.hrms.practiceJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Task2 {
    
	String userName = "syntax_hrm";
    String password = "syntaxhrm123";
    String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
    @Test
    public void retrieveAllJobTitles() throws SQLException {
        List<String> job_titles = new ArrayList<>();
        // get collection method
        Connection connection = DriverManager.getConnection(dbURL, userName, password);
        // create an object of the statement class
        Statement st = connection.createStatement();
        // execute the query
        ResultSet rset = st.executeQuery("select * from ohrm_job_title");
        while (rset.next()) {
            job_titles.add(rset.getString("job_title"));
        }
        System.out.println(job_titles);
    }
}