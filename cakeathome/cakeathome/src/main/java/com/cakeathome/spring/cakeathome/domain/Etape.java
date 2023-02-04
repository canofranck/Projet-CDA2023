package com.cakeathome.spring.cakeathome.domain;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ETAPE")

public class Etape implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID_ETAPE")
	private long id_etape;

	@Column(name = "NUMERO_ETAPE")
	private int numero_etape;

	@Column(name = "INSTRUCTIONS_ETAPE")
	private String instructions_etape;

	@Column(name = "IMAGE_ETAPE")
	private String image_etape;

	// ASSOCIATION

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_recette")
	private Recette recette;

	// Getter and Setter

	public long getId_etape() {
		return id_etape;
	}

	public void setId_etape(long id_etape) {
		this.id_etape = id_etape;
	}

	public int getNumero_etape() {
		return numero_etape;
	}

	public void setNumero_etape(int numero_etape) {
		this.numero_etape = numero_etape;
	}

	public String getInstructions_etape() {
		return instructions_etape;
	}

	public void setInstructions_etape(String instructions_etape) {
		this.instructions_etape = instructions_etape;
	}

	public String getImage_etape() {
		return image_etape;
	}

	public void setImage_etape(String image_etape) {
		this.image_etape = image_etape;
	}

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	// Constructor
	public Etape(long id_etape, int numero_etape, String instructions_etape, String image_etape, Recette recette) {
		super();
		this.id_etape = id_etape;
		this.numero_etape = numero_etape;
		this.instructions_etape = instructions_etape;
		this.image_etape = image_etape;
		this.recette = recette;
	}

	public Etape() {
		super();
	}

}
