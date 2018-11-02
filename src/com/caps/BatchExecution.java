package com.caps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchExecution {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		try {
			/*
			 * 1. Load the Driver
			 */
			Class.forName("com.mysql.jdbc.Driver");

			/*
			 * 2. Get the DB Connection via Driver
			 */
			System.out.println("Insert employee details");
			
			String dbUrl="jdbc:mysql://localhost:3306/capsv4_db";

			//3rd version of getConnnecton()
			con = DriverManager.getConnection(dbUrl,"root","root"); //1st version of getConnection

			System.out.println("Connected...");

			/*
			 * 3. Issue the SQL query via connection
			 */
			stmt = con.createStatement();
			
			String sql = "insert into emp_info values(122,'abhi','abhi@gmail.com',22000)";
			
			stmt.addBatch(sql);
			
			sql = "insert into emp_info values(145,'pramod','pramod@gmail.com',12200)";
			//System.out.println(sql);
			stmt.addBatch(sql);
			
			sql = "insert into emp_info values(12,'roshan','roshan@gmail.com',26000)";
			//System.out.println(sql);
			stmt.addBatch(sql);
			
			
			int[] count = stmt.executeBatch();
			
			/*
			 * 4. Process the results
			*/ 

	
				System.out.println(count.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end of main
}
