package com.Setters;

import java.sql.*;
import java.util.Scanner;

public class UsingSetters {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC3", "root", "root");
		CallableStatement p = c.prepareCall("select * from student where sid=?");
		
		Scanner scn = new Scanner(System.in);
		p.setInt(1, scn.nextInt());
//		p.setString(2, scn.next());
//		p.setLong(3, scn.nextLong()); 
		ResultSet e = p.executeQuery();
		while(e.next()) {
		System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getLong(3));
		}
		c.close();
	}
}
