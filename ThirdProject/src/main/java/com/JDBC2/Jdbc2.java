package com.JDBC2;
import java.sql.*;
public class Jdbc2 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC2","root","root");
	CallableStatement p= c.prepareCall("INSERT INTO MARKS VALUES('JEEVAN',66,2020)");
	boolean e=p.execute();
	System.out.println(e);
	c.close();
}
}
