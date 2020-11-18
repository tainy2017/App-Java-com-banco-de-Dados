package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
public Connection getConnection() {
  try {
	  return DriverManager.getConnection("jdbc:mysql://localhost:3306/javaTeste","root","123456");
	 // return DriverManager.getConnection("jdbc:postgresql://localhost:5432/carros","postgres","123456");
  }catch(Exception ex) {
	  throw new RuntimeException(ex);
  }
}
}
