package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {
	
private Connection connection;

public FuncionarioDao() {
	this.connection = new ConnectionFactory().getConnection(); 
}
public void insereFuncionario(Funcionario funcionario) {
	String SQL ="insert into funcionarios" +
"(nome,senha)"+"values (?,?)";
	try {
		PreparedStatement prepSt = connection.prepareStatement(SQL);
		prepSt.setString(1, funcionario.getNome());
		prepSt.setString(2, funcionario.getSenha());
		prepSt.execute();
		prepSt.close();
	}catch(SQLException ex) {
		throw new RuntimeException(ex);
	}
}
public List<Funcionario> getListaFuncionarios(){
	List<Funcionario> lista = new ArrayList<Funcionario>();
	try {
		PreparedStatement stm = this.connection.prepareStatement("select * from funcionarios");
	    ResultSet result = stm.executeQuery();
	    while(result.next()) {
	    	Funcionario funcionario = new Funcionario();
	    	funcionario.setId(result.getInt("id"));
	    	funcionario.setNome(result.getString("nome"));
	    	funcionario.setSenha(result.getString("senha"));
	    }
	    result.close();
	    stm.close();
	}catch(SQLException e) {
	  throw new RuntimeException(e);	
	}
	return lista;
}
public void AlteraFuncionario(int id) {
	String sql = "update funcionarios setnome= ?, setsenha=?";
}
}
