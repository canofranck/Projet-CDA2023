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

import com.cakeathome.spring.cakeathome.dao.UtilisateurDao;
import com.cakeathome.spring.cakeathome.domain.Utilisateur;



@RestController
@RequestMapping
@CrossOrigin("*")
public class UtilisateurController {
	
	@Autowired
	UtilisateurDao utilisateurDao;
	
	@GetMapping("/utilisateur")
	public List<Utilisateur> getAllUtilisateurs(@Validated @RequestBody(required = false) Utilisateur utilisateur) {
		return utilisateurDao.getUtilisateurs();		
}
	@PostMapping("/utilisateur")
	public Utilisateur createUtilisateurs(@Validated @RequestBody(required = false) Utilisateur utilisateur) {
		return utilisateurDao.saveUtilisateur(utilisateur);
	
}
	@GetMapping("/utilisateur/{IdUtilisateur}")
	public ResponseEntity findutilisateurById(@PathVariable(name = "IdUtilisateur")Long idUtilisateur){
		if (idUtilisateur == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Utilisateur utilisateur = utilisateurDao.getUtilisateurByID(idUtilisateur);
		
		if (utilisateur == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(utilisateur); 
		
	}
	
}