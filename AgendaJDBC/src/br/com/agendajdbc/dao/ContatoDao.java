package br.com.agendajdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.agendajdbc.classes.Contatos;
import br.com.agendajdbc.connectionfactory.ConnectionFactory;

public class ContatoDao {


	
	// Método para fazer a inserção no Banco de Dados
	public void adiciona(Contatos contato) {
	    		
		
		String sql = "insert into contato" +
		"(nm_contato,tel_contato,cel_contato,email_contato)" +
		" values (?,?,?,?)";
		
		try {
			
		// Abre a Conexão com o banco	
			Connection con = new ConnectionFactory().openConnection();
		// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1,contato.getNm_contato());
			stmt.setString(2,contato.getTel_contato());
			stmt.setString(3,contato.getCel_contato());
			stmt.setString(4,contato.getEmail_contato());
			
			// executa o comando SQL
			stmt.execute();
			stmt.close(); 
			System.out.print("registro incluido");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
