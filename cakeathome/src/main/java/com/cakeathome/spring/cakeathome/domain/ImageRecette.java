package com.cakeathome.spring.cakeathome.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="IMAGERECETTE")
public class ImageRecette  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDIMAGEETAPE")
	private long IdImageEtape;
	
	@Column(name = "IDRECETTE")
	private long IdRecette;
	
	@Column(name = "IMAGEETAPE")
	private String imageEtape;

	public long getIdImageEtape() {
		return IdImageEtape;
	}

	public void setIdImageEtape(long idImageEtape) {
		IdImageEtape = idImageEtape;
	}

	public long getIdRecette() {
		return IdRecette;
	}

	public void setIdRecette(long idRecette) {
		IdRecette = idRecette;
	}

	public String getImageEtape() {
		return imageEtape;
	}

	public void setImageEtape(String imageEtape) {
		this.imageEtape = imageEtape;
	}

	public ImageRecette(long idImageEtape, long idRecette, String imageEtape) {
		super();
		IdImageEtape = idImageEtape;
		IdRecette = idRecette;
		this.imageEtape = imageEtape;
	}

	public ImageRecette() {
		super();
	}

	
}
