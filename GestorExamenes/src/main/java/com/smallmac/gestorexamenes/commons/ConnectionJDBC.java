package com.smallmac.gestorexamenes.commons;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
	
	 public static Connection getConnection(){
		 Connection con=null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cbc_gestorexamenes","root","root");
			
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return con;
	 }
}
