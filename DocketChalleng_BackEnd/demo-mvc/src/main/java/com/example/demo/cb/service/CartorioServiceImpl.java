package com.example.demo.cb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.cb.dao.CartorioDaoImpl;
import com.example.demo.cb.domain.Cartorio;
@Component
@Service @Transactional (readOnly = false)
@ComponentScan({"com.example.demo.cb.dao","com.example.demo.cb.service","com.example.demo.cb.domain","com.example.demo.cb.web.controller"})
public class CartorioServiceImpl implements CartorioServiceInterface{
	
	@Autowired(required = true)
	private CartorioDaoImpl dao;

	@Override
	public void salvar(Cartorio cartorio) {
		dao.save(cartorio);
		
	}

	@Override
	public void editar(Cartorio cartorio) {
		dao.update(cartorio);
		
	}

	@Override 
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Cartorio buscarporId(Long id) {
		return dao.findById(id);
	}

	@Override  @Transactional(readOnly = true)
	public List<Cartorio> buscarTodos() {
		return dao.findAll();
	}
	
}
