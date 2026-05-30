package com.tickek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tickek.infrastructure.repositories.UsuarioRepository;

@SpringBootApplication
public class SerpostApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SerpostApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ur.findAll().forEach(System.out::println);
	}


	@Autowired
	private UsuarioRepository ur;
}
