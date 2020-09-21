package com.example.demo.cb.web.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.cb.dao.RelacCartCertDaoImpl;
import com.example.demo.cb.domain.Cartorio;
import com.example.demo.cb.domain.UF;
import com.example.demo.cb.service.CartorioServiceImpl;
import com.example.demo.cb.service.RelacCartCertService;
import com.example.demo.cb.service.RelacCartCertServiceImpl;

@Controller
@RequestMapping("/cartorios")
public class CartorioController {
	
	@Autowired
	private CartorioServiceImpl cartservice;
//	//@Autowired
//	private CertidaoServiceImpl certservice;
//	
	private RelacCartCertService relacserice;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Cartorio cartorio) {
		return "/cartorio/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("cartorios",cartservice.buscarTodos());
		return "/cartorio/lista";
	}
	
	
	@PostMapping("/salvar")
	public String salvar(Cartorio cartorio) {
		cartservice.salvar(cartorio);
		return"redirect:/cartorios/cadastrar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id,ModelMap model) {
		model.addAttribute("cartorio", cartservice.buscarporId(id));
		return "/cartorio/cadastro";		
	}

	@PostMapping("/editar")
	public String editar(Cartorio cartorio) {
		cartservice.editar(cartorio);
		return"redirect:/cartorios/cadastrar";
	}
	
	@GetMapping ("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		if (!relacserice.cartidaoTemVinculo(id)) {
			cartservice.excluir(id);
		}
		return"redirect:/cartorios/listar";
	}
	
	

}
