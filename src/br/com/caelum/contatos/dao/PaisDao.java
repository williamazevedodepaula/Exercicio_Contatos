package br.com.caelum.contatos.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.contatos.modelo.Pais;

public class PaisDao {
	
	private EntityManagerFactory factory;
	public PaisDao(EntityManagerFactory factory){
		this.factory = factory;
	}
	
	public void save(Pais pais){
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(pais);
		manager.getTransaction().commit();
		manager.close();
	}
}
