package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class HelloController {
	
	@GetMapping ("/hello1") //endpoint
	public String hello() {
		return "Hello Generention!";
	}
	
	@GetMapping ("/hello2")
	public String bsm() {
		return "\t\tMentalidades:\n-Orientação ao futuro\n-Responsabilidade pessoal\n-Mentalidade de crescimento\n-Persistência\n\n"
				+"\t\tHabilidades:\n-Trabalho em equipe\n-Orientação ao detalhe\n-Pró-atividade\r\n-Comunicação";
	}
	
	@GetMapping ("/hello3")
	public String objetivos() {
		return "-Fixar o conhecimento de Poo e DataBase.\n-Introdução a Spring";
	}
	
}
