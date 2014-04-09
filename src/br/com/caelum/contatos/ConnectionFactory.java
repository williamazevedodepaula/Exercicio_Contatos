package br.com.caelum.contatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
		    try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
			return DriverManager.getConnection("jdbc:mysql://localhost/tutorial_jdbc","root","93140743");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
