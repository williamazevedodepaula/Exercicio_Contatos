package br.com.caelum.contatos.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.contatos.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão Aberta!");
		connection.close();
	}
}
