package br.com.caelum.contatos.jpa;

import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.contatos.dao.EstadoDao;
import br.com.caelum.contatos.dao.PaisDao;
import br.com.caelum.contatos.modelo.Estado;
import br.com.caelum.contatos.modelo.Pais;

public class TestaInsere {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		
		Pais pais = new Pais();
		
		pais.setNome("Brasil");
		pais.setEstados(new ArrayList<Estado>());
		
		Estado estado = new Estado();
		
		estado.setId(1L);
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");
		estado.setPais(pais);
		
		PaisDao pdao = new PaisDao(factory);
		pdao.save(pais);
		
		pais.getEstados().add(estado);
		
		EstadoDao estdao = new EstadoDao(factory);
		estdao.save(estado);							
		
	}
}
