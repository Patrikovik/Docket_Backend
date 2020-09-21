package com.example.demo.cb.service;

import java.util.List;

import com.example.demo.cb.domain.Certidao;

public interface CertidaoServiceInterface {
	void salvar(Certidao certidao);
	
	void editar(Certidao certidao);
	
	void excluir(Long id);

	Certidao buscarporId(Long Id);
	
	List<Certidao> buscarTodos();
	

}
