package com.caps;
import java.io.FileReader;
import java.util.Properties;

public class ReadProps {
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C:\\Users\\patil\\Desktop\\CAPage"
				+ "\\JDBC\\MyJDBCProject\\Files\\Data.properties");
		
		Properties prop = new Properties();
		prop.load(in);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("password"));
		
	}
}