package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cakeathome.spring.cakeathome.domain.Recette;

import com.cakeathome.spring.cakeathome.repository.IRecetteRepository;

@Service
public class RecetteDao {
	@Autowired
	IRecetteRepository recetteRepository;
	// Liste Recette

	public List<Recette> getRecettes() {
		return recetteRepository.findAll();
	}
	
	
	// create une Recette
	public Recette saveRecette( Recette recette) {
		return recetteRepository.save(recette);
	}

	// recupere une Recette par ID 
	public  Recette getRecetteByID(Long Idrecette) {
		return recetteRepository.findById(Idrecette).get();
	}
	// Delete une Recette
	
	public void deleteRecette(Recette recette) {
		recetteRepository.delete(recette);
	}

	// modifier une Recette
	
	public  Recette updateRecette(Recette recette) {
		return recetteRepository.save(recette);
		
	}
}
