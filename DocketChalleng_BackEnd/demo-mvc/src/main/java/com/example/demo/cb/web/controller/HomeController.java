package com.example.demo.cb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	//Transforma a classe em um BEAN do tipo controller do MVC.
public class HomeController {
	@GetMapping("/") //O Contexto da aplicação é acessado através desta anotação.
	public String home() {
		return "/home";
	}
}
	