package br.com.caelum.contatos.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6982307614680605191L;

	@Id
	private Long id;
	
	@Id
	@ManyToOne
	@JoinColumn(name="pais_id")
	private Pais pais;
	
	private String sigla;
	private String nome;
	
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
