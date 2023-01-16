package com.cakeathome.spring.cakeathome.domain;

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
@Table(name="IMAGE_RECETTE")
public class ImageRecette  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_IMAGE_RECETTE")
	private long id_image_recette;
	
	@Column(name = "IMAGERECETTE")
	private String imagerecette;

	// ASSOCIATION
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_recette")
	
	private Recette recette;

	// GETTER
	
	

	public ImageRecette() {
		super();
	}

	public long getId_image_recette() {
		return id_image_recette;
	}

	public void setId_image_recette(long id_image_recette) {
		this.id_image_recette = id_image_recette;
	}

	public String getImagerecette() {
		return imagerecette;
	}

	public void setImagerecette(String imagerecette) {
		this.imagerecette = imagerecette;
	}

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	public ImageRecette(long id_image_recette, String imagerecette, Recette recette) {
		super();
		this.id_image_recette = id_image_recette;
		this.imagerecette = imagerecette;
		this.recette = recette;
	}

	
	
	
	
	
	
	
	
}
