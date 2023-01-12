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

import com.cakeathome.spring.cakeathome.dao.EtapeDao;

import com.cakeathome.spring.cakeathome.domain.Etape;


@RestController
@RequestMapping
@CrossOrigin("*") 
public class EtapeController {

	@Autowired
	EtapeDao etapeDao;
	
	@GetMapping("/etape")
	public List<Etape> getAllEtapes(@Validated @RequestBody(required = false) Etape etape) {
		return etapeDao.getEtapes();		
}
	@PostMapping("/etape")
	public Etape createEtape(@Validated @RequestBody(required = false) Etape etape) {
		return etapeDao.saveEtape(etape);
	
}
	@GetMapping("/etape/{IdEtape}")
	public ResponseEntity findetapeById(@PathVariable(name = "IdEtape")Long idEtape){
		if (idEtape == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Etape etape = etapeDao.getEtapeByID(idEtape);
		
		if (etape == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(etape); 
		
	}
	
}
