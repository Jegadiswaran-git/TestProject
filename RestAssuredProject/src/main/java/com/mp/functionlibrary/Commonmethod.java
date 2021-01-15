package com.mp.functionlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




	
	// public static WebDriver driver;
	 
	public class Commonmethod {
		
		public static void main(String[] args) {
		
		{
			
			try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:60460/browser", "jegadiswarans", "customer")) {
				
				 

				if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
		
	}
	}