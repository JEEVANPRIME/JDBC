package com.Monady;

import java.sql.*;

public class Mainclass {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/monday", "root", "root");
		CallableStatement p = c.prepareCall("select * from emp where id in(1,2,3)");
		ResultSet e = p.executeQuery();
		System.out.println("EmpId" + "\t" + "Name" + "\t" + "Phone number");

		while (e.next()) {
			System.out.println(e.getInt(1) + "\t" + e.getString(2) + "\t" + e.getLong(3));
		}
		c.close();
	}
}
