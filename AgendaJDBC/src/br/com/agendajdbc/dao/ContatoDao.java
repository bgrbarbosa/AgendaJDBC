package br.com.agendajdbc.dao;

/* Esta classe ser� utilizada para fazer gerenciar as conex�es e o CRUD com o banco de dados 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.agendajdbc.classes.Contatos;
import br.com.agendajdbc.connectionfactory.ConnectionFactory;

public class ContatoDao {

	private Connection connection;
	
	//M�todo de Conex�o com o Banco
	public ContatoDao() {
		this.connection = new ConnectionFactory().openConnection();
	}
	
	
	// M�todo para fazer a inser��o no Banco de Dados
	public void adiciona(Contatos contato) {
		
		
		String sql = "insert into contatos " +
		"(nm_contato,tel_contato,cel_contato,email_contato)" +
		" values (?,?,?,?)";
		
		try {
		// prepared statement para inser��o
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1,contato.getNm_contato());
			stmt.setString(2,contato.getTel_contato());
			stmt.setString(3,contato.getCel_contato());
			stmt.setString(3,contato.getEmail_contato());
			
			// executa o comando SQL
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
}
