package br.com.caelum.contatos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.caelum.contatos.ConnectionFactory;
import br.com.caelum.contatos.modelo.Contato;

public class ContatoDao {

	//private Connection connection;
	private EntityManagerFactory factory;
	public ContatoDao(){
		//this.connection = new ConnectionFactory().getConnection();
		factory = Persistence.createEntityManagerFactory("contatos");
	}
	
	public void adiciona(Contato contato){
	/*	String sql = "insert into contatos" +
					 "(nome,email,endereco,dataNascimento)" +
					 "values" +
					 "( ? , ? , ? , ?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4,new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException  e) {
			throw new RuntimeException(e);
		}
		*/		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		System.out.println("ID da tarefa: " + contato.getId());
		manager.close();
	}
	
	public List<Contato> getLista(){
		
		/*try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				Calendar data = Calendar.getInstance();	
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);
				
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw  new RuntimeException(e);
		}
		*/
		return null;				
	}
	
	public Contato find(Long id){
		EntityManager manager = factory.createEntityManager();
		Contato contato =  manager.find(Contato.class,id);		
		manager.close();
		return contato;
	}
		
}
