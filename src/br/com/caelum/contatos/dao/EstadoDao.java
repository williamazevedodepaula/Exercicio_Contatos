package br.com.caelum.contatos.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.contatos.modelo.Estado;
import br.com.caelum.contatos.modelo.Pais;

public class EstadoDao {
	
	private EntityManagerFactory factory;
	public EstadoDao(EntityManagerFactory factory){
		this.factory = factory;
	}
	
	public void save(Estado estado){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(estado);
		manager.getTransaction().commit();
		manager.close();
	}
}
