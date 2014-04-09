package br.com.caelum.contatos.modelo;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="pais_id",updatable=true)
	private Collection<Estado> estados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Estado> getEstados() {
		return estados;
	}

	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}

	
}
