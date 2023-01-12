package com.cakeathome.spring.cakeathome.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="INGREDIENT")

public class Ingredient   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDINGREDIENT")
	private Long IdIngredient;
	
	@Column(name = "IDRECETTE")
	private long IdRecette;
	
	@Column(name = "NOMINGREDIENTS")
	private String nomIngredients;
	
	@Column(name = "QUANTITE")
	private int Quantite;

	public Long getIdIngredient() {
		return IdIngredient;
	}

	public void setIdIngredient(Long idIngredient) {
		IdIngredient = idIngredient;
	}

	public long getIdRecette() {
		return IdRecette;
	}

	public void setIdRecette(long idRecette) {
		IdRecette = idRecette;
	}

	public String getNomIngredients() {
		return nomIngredients;
	}

	public void setNomIngredients(String nomIngredients) {
		this.nomIngredients = nomIngredients;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

	public Ingredient(Long idIngredient, long idRecette, String nomIngredients, int quantite) {
		super();
		IdIngredient = idIngredient;
		IdRecette = idRecette;
		this.nomIngredients = nomIngredients;
		Quantite = quantite;
	}

	public Ingredient() {
		super();
	}
	
	

}
