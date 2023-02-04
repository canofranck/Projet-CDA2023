package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Ingredient;
import com.cakeathome.spring.cakeathome.domain.Recette;

import com.cakeathome.spring.cakeathome.repository.IRecetteRepository;

@Service
public class RecetteDao {
	@Autowired
	IRecetteRepository recetteRepository;
	
	// List Recette

	public List<Recette> getRecettes() {
		return recetteRepository.findAll();
	}
	
	
	// create  Recette
	public Recette saveRecette( Recette recette) {
		return recetteRepository.save(recette);
	}

	// Get Recette by ID 
	public  Recette getRecetteByID(Long id_recette) {
		return recetteRepository.findById(id_recette).get();
	}
	// Delete Recette
	
	public void deleteRecette(Recette recette) {
		recetteRepository.delete(recette);
	}

	// Update Recette
	
	public  Recette updateRecette(Recette recette) {
		return recetteRepository.save(recette);
		
	}
	public void addIngredientToRecette(Long id_recette, Ingredient id_ingredient) {
	    Recette recette = recetteRepository.findById(id_recette).get();
	    recette.getIngredients().add(id_ingredient);
	    recetteRepository.save(recette);
	}
}
