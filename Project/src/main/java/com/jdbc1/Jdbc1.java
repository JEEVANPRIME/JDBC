package com.jdbc1;

import java.sql.*;

public class Jdbc1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
		CallableStatement p = c.prepareCall("insert into details values(2,'jeevan',23)");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
	}
}
