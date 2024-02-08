package com.example.construindoprimeiroservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.construindoprimeiroservico")
public class ConstruindoPrimeiroServicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstruindoPrimeiroServicoApplication.class, args);
	}

}
