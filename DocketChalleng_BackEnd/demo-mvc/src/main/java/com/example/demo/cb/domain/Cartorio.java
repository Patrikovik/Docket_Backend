package com.example.demo.cb.domain;

import javax.persistence.*;

import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARTORIO")
@ComponentScan({"com.example.demo.cb.dao","com.example.demo.cb.service","com.example.demo.cb.domain","com.example.demo.cb.web.controller"})

public class Cartorio extends AbstractEntity<Long> {
	
	@Column( nullable = false, unique = true, length = 255 )
	private String nome;
	
		
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id_fk")
	private Endereço endereco;
		

	public String getNome() {	
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

		
	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}



	


}
