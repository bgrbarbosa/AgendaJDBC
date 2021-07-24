package br.com.agendajdbc.connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// M�todo para conectar ao banco de dados
	public Connection openConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("N�o foi Poss�vel a Conex�o com o Servidor", e);
		}
		
	}
}
