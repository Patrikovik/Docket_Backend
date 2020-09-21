package com.example.demo.cb.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "CERTIDAO")
public class Certidao extends AbstractEntity<Long> {
	
	
	@Column(name = "nome", nullable = false, unique = true, length = 255)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	

}
