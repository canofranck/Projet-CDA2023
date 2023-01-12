package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient, Long>{

}
