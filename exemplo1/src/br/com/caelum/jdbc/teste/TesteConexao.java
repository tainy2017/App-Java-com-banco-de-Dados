package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import br.com.caelum.jdbc.*;

public class TesteConexao {

	public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta!");
		connection.close();
	}

}
