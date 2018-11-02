package com.caps;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class TransactionControl {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			

			String dbUrl="jdbc:mysql://localhost:3306/capsv4_db";

			//3rd version of getConnnecton()
			con = DriverManager.getConnection(dbUrl,"root","root"); //1st version of getConnection

			System.out.println("Connected...");
			
			con.setAutoCommit(false);
			
			stmt=con.createStatement();
			
			String sql = "insert into emp_info values(1272,'abhi','abhi@gmail.com',22000)";
			int a = stmt.executeUpdate(sql);
			
			sql = "insert into emp_info values(1697,'abhi','abhi@gmail.com',22000)";
			int b = stmt.executeUpdate(sql);
			
			sql = "insert into emp_info values(1511,'abhi','abhi@gmail.com',22000)";
			int c = stmt.executeUpdate(sql);
			
			if(a==1 && b==1 && c==1) {
				con.commit();
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
