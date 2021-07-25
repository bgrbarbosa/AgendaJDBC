package br.com.agendajdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.agendajdbc.classes.Contatos;
import br.com.agendajdbc.connectionfactory.ConnectionFactory;

public class ContatoDao {
	
	// Método para fazer a inserção no Banco de Dados
	public void adiciona(Contatos contato) {
	    		
		// String SQL para inserir dados no banco
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
	
	// Método para listar todos os Contatos
	public List<Contatos> listarContatos() {
		
		String sql = "select * from contato";
		List<Contatos> listaContatos = new ArrayList<Contatos>();
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco. ***SELECT****
		ResultSet rset = null;
		try {
			
			con = ConnectionFactory.openConnection();
			pstm = (PreparedStatement) con.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			
			while (rset.next()) {
				// criando o objeto Resultado da pesquisa de Contatos
				Contatos contato = new Contatos();
				
				contato.setId_contato(rset.getInt("id_contato"));
				contato.setNm_contato(rset.getString("nm_contato"));
				contato.setTel_contato(rset.getString("tel_contato"));
				contato.setCel_contato(rset.getString("cel_contato"));
				contato.setEmail_contato(rset.getString("email_contato"));
				
				//Adiciona na lista de contatos
				listaContatos.add(contato);

			}	
			
		} catch (SQLException e) {}		
		
		finally {
			try {
				if(rset!=null) {
					rset.close();
				}
				
				if(pstm!=null) {
					pstm.close();
				}
				
				if(con!=null) {
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return listaContatos;
	}
	
	
}
