package com.cakeathome.spring.cakeathome.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "INGREDIENT")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_ingredient")
public class Ingredient implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID_INGREDIENT")
	private Long id_ingredient;

	@Column(name = "NOMINGREDIENTS")
	private String nomingredients;

	@Column(name = "QUANTITE")
	private int quantite;

	// ASSOCIATION
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "id_recette") private Recette recette;
	 */

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "ingredients")
	/*
	 * @JoinTable(name = "recette_ingredient", joinColumns = @JoinColumn(name =
	 * "id_ingredient"), inverseJoinColumns = @JoinColumn(name = "id_recette"))
	 */
	private List<Recette> recettes = new ArrayList<>();

	// GETTER and Setter

	public Long getId_ingredient() {
		return id_ingredient;
	}

	public void setId_ingredient(Long id_ingredient) {
		this.id_ingredient = id_ingredient;
	}

	public String getNomingredients() {
		return nomingredients;
	}

	public void setNomingredients(String nomingredients) {
		this.nomingredients = nomingredients;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public List<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(List<Recette> recettes) {
		this.recettes = recettes;
	}

	// Constructor
	public Ingredient(Long id_ingredient, String nomingredients, int quantite, List<Recette> recettes) {
		super();
		this.id_ingredient = id_ingredient;
		this.nomingredients = nomingredients;
		this.quantite = quantite;
		this.recettes = recettes;
	}

	public Ingredient() {
		super();
	}

}
