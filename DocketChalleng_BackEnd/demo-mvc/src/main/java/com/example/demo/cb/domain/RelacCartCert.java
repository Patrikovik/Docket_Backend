package com.example.demo.cb.domain;

import javax.persistence.*;

import org.springframework.context.annotation.ComponentScan;


@SuppressWarnings("serial")
@Entity
@Table(name = "RELACCARTCERT")
@ComponentScan({"com.example.demo.cb.dao","com.example.demo.cb.service","com.example.demo.cb.domain","com.example.demo.cb.web.controller"})

public class RelacCartCert extends AbstractEntity<Long>{
	
	@ManyToOne	
	@JoinColumn(name = "id_cartorio_fk")
	private Cartorio cartorio;
	
	@ManyToOne
	@JoinColumn(name = "id_certidao_fk")
	private Certidao certidao;

	public Cartorio getCartorio() {
		return cartorio;
	}

	public void setCartorio(Cartorio cartorio) {
		this.cartorio = cartorio; 
	}

	public Certidao getCertidao() {
		return certidao;
	}

	public void setCertidao(Certidao certidao) {
		this.certidao = certidao;
	}


	
	
	
}
