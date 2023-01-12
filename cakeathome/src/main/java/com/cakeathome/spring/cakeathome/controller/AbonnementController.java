package com.cakeathome.spring.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.spring.cakeathome.dao.AbonnementDao;

import com.cakeathome.spring.cakeathome.domain.Abonnement;


@RestController
@RequestMapping
@CrossOrigin("*")
public class AbonnementController {
	@Autowired
	AbonnementDao abonnementDao;
	
	@GetMapping("/abonnement")
	public List<Abonnement> getallaAbonnements(@Validated @RequestBody(required = false) Abonnement abonnement) {
		return abonnementDao.getAbonnements();		
}
	@PostMapping("/abonnement")
	public Abonnement createAbonnement(@Validated @RequestBody(required = false)  Abonnement abonnement) {
		return abonnementDao.saveAbonnement(abonnement);
	
}
	@GetMapping("/abonnement/{IdAbonnement}")
	public ResponseEntity findabonnementById(@PathVariable(name = "IdAbonnement")Long idAbonnement){
		if (idAbonnement == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Abonnement abonnement = abonnementDao.getAbonnementByIdAbonnement(idAbonnement);
		
		if (abonnement
				== null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(abonnement); 
		
	}
	
}