package com.cakeathome.spring.cakeathome.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="ETAPE")

public class Etape  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDETAPE")
	private long IdEtape;
	@Column(name = "NUMERO")
	private int Numero;
	@Column(name = "INSTRUCTIONS")
	private String instructions;
	@Column(name = "IMAGETAPE")
	private String ImageEtape;
	public long getIdEtape() {
		return IdEtape;
	}
	public void setIdEtape(long idEtape) {
		IdEtape = idEtape;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String getImageEtape() {
		return ImageEtape;
	}
	public void setImageEtape(String imageEtape) {
		ImageEtape = imageEtape;
	}
	public Etape(long idEtape, int numero, String instructions, String imageEtape) {
		super();
		IdEtape = idEtape;
		Numero = numero;
		this.instructions = instructions;
		ImageEtape = imageEtape;
	}
	public Etape() {
		super();
	}
	
	
}
