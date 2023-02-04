package com.cakeathome.spring.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.spring.cakeathome.dao.RecetteDao;
import com.cakeathome.spring.cakeathome.dao.UtilisateurDao;
import com.cakeathome.spring.cakeathome.domain.Abonnement;
import com.cakeathome.spring.cakeathome.domain.Ingredient;
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

	@GetMapping("/recette/{id_recette}")
	public ResponseEntity findrecetteById(@PathVariable(name = "id_recette") Long id_recette) {
		if (id_recette == null) {
			return ResponseEntity.badRequest().body("not found Recette by ID");
		}

		Recette recette = recetteDao.getRecetteByID(id_recette);

		if (recette == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok().body(recette);

	}

	@PutMapping("/recettes/{id_recette}")
	public ResponseEntity<Recette> updateRecette(@Validated @PathVariable(name = "id_recette") Long id_recette,
			@RequestBody(required = false) Recette recette) {
		if (recette == null) {
			return ResponseEntity.notFound().build();

		}
		recette.setId_recette(id_recette);
		recetteDao.updateRecette(recette);
		return ResponseEntity.ok().body(recette);
	}

	@DeleteMapping("/recettes/{id_recette}")
	public ResponseEntity<Recette> deleteRecette(@Validated @PathVariable(name = "id_recette") Long id_recette) {

		Recette recette = recetteDao.getRecetteByID(id_recette);

		if (recette == null) {
			return ResponseEntity.notFound().build();

		}
		recetteDao.deleteRecette(recette);
		return ResponseEntity.ok().body(recette);

	}

	@PostMapping("/recettes/{recetteId}/ingredients/{ingredientId}")
	public void addIngredientToRecette(@PathVariable Long id_recette, @PathVariable Ingredient id_ingredient) {
		recetteDao.addIngredientToRecette(id_recette, id_ingredient);
	}
}