package com.JDBC3;

import java.sql.*;

public class Jdbc3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC3", "root", "root");
		CallableStatement p = c.prepareCall("INSERT INTO EMPLOYEEDETAILS VALUES(3,'RAJ',95,651234878)");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
	}
}
