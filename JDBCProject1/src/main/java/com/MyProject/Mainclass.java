package com.MyProject;

import java.sql.*;

public class Mainclass {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/binders", "root", "root");
		CallableStatement p = c.prepareCall("insert into book values(2,'calico binding',250)");
		boolean e=p.execute();
		System.out.println(e); 
		c.close();
	}
}
