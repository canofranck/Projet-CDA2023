package com.cakeathome.spring.cakeathome;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cakeathome.spring.cakeathome.domain.Utilisateur;

@SpringBootApplication
public class CakeathomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakeathomeApplication.class, args);
		
//		 Utilisateur util = new Utilisateur(1L,"fcr","fcr","home","fcr@" ,"13/01/2023","meaux","dffd");
		
// System.out.println(util);
}
	
}