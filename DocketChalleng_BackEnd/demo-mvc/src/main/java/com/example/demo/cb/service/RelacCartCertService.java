package com.example.demo.cb.service;

import java.util.List;

import com.example.demo.cb.domain.RelacCartCert;

public interface RelacCartCertService {
void salvar(RelacCartCert relaccartcert);
	
	void editar(RelacCartCert relaccartcert);
	
	void excluir(Long id);

	RelacCartCert buscarporId(Long Id);
	
	List<RelacCartCert> buscarTodos();


	boolean certidaoTemVinculo(Long id);
	
	boolean cartidaoTemVinculo(Long id);
	

}
