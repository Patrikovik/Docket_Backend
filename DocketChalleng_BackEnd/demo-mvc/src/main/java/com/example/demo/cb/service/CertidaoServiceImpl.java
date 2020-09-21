package com.example.demo.cb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.cb.dao.CertidaoDaoImpl;
import com.example.demo.cb.domain.Certidao;

@Service @Transactional(readOnly = false)
public class CertidaoServiceImpl implements CertidaoServiceInterface {
	
	@Autowired
	private CertidaoDaoImpl dao;

	@Override
	public void salvar(Certidao certidao) {
		dao.save(certidao);
	}

	@Override
	public void editar(Certidao certidao) {
		dao.update(certidao);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Certidao buscarporId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Certidao> buscarTodos() {
		return dao.findAll();
	}


}
