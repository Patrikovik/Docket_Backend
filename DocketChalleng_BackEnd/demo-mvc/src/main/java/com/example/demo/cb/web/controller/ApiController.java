package com.example.demo.cb.web.controller;



import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cb.domain.Cartorio;
import com.example.demo.cb.domain.Certidao;
import com.example.demo.cb.domain.RelacCartCert;
import com.example.demo.cb.domain.UF;
import com.example.demo.cb.service.CartorioServiceImpl;
import com.example.demo.cb.service.CertidaoServiceImpl;
import com.example.demo.cb.service.RelacCartCertService;


@RestController
public class ApiController {
	
	@Autowired
	private RelacCartCertService relac;
	
	@Autowired
	private CartorioServiceImpl cartservice;
//	//@Autowired
//	private CertidaoServiceImpl certservice;
//	

	@GetMapping("/APIcartrelat")
	public List<RelacCartCert> listaDeCertidao(){ // A classe API, para exibição das relações cadastradas utiliza as classes já criadas para SERVICE e DAO.
		return relac.buscarTodos();
	}
	
	
	
	
	
}
