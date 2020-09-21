package com.example.demo.cb.service;

import java.util.List;

import com.example.demo.cb.domain.Cartorio;

public interface CartorioServiceInterface {
	
void salvar(Cartorio cartorio);
	
	void editar(Cartorio cartorio);
	
	void excluir(Long id);

	Cartorio buscarporId(Long Id);
	
	List<Cartorio> buscarTodos();

}
