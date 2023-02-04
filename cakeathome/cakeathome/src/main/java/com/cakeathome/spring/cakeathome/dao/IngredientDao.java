package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Ingredient;

import com.cakeathome.spring.cakeathome.repository.IIngredientRepository;

@Service
public class IngredientDao {
	@Autowired
	IIngredientRepository ingredientRepository;

	// List ingredient

	public List<Ingredient> getIngredients() {
		return ingredientRepository.findAll();
	}

	// create ingredient

	public Ingredient saveIngredient(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}

	// Get ingredient by ID

	public Ingredient getIngredientByID(Long id_ingredient) {
		return ingredientRepository.findById(id_ingredient).get();
	}
	// Delete ingredient

	public void deleteIngredient(Ingredient ingredient) {
		ingredientRepository.delete(ingredient);
	}

	// Update ingredient

	public Ingredient updateIngredient(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);

	}
}
