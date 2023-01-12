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

import com.cakeathome.spring.cakeathome.dao.RecetteDao;
import com.cakeathome.spring.cakeathome.dao.UtilisateurDao;
import com.cakeathome.spring.cakeathome.domain.Recette;
import com.cakeathome.spring.cakeathome.domain.Utilisateur;

@RestController
@RequestMapping
@CrossOrigin("*")
public class RecetteController {
	@Autowired
	RecetteDao recetteDao;
	
	@GetMapping("/recette")
	public List<Recette> getAllRecettes(@Validated @RequestBody(required = false) Recette recette) {
		return recetteDao.getRecettes();		
}
	@PostMapping("/recette")
	public Recette createRecettes(@Validated @RequestBody(required = false) Recette recette) {
		return recetteDao.saveRecette(recette);
	
}
	@GetMapping("/recette/{Idrecette}")
	public ResponseEntity findrecetteById(@PathVariable(name = "Idrecette")Long idrecette){
		if (idrecette == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Recette recette = recetteDao.getRecetteByID(idrecette);
		
		if (recette== null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(recette);
		
	}
	
}