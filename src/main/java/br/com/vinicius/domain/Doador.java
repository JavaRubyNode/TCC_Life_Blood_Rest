package br.com.vinicius.domain;

import java.io.Serializable;

public class Doador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8558914589068414876L;
	
	private Long id;
	private String nome;
	private String sobrenome;
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Doador(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Doador() {
		super();
	}
	
	
	

}
