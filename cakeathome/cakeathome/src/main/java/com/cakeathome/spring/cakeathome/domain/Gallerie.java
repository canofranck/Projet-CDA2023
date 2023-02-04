package com.cakeathome.spring.cakeathome.domain;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GALLERIE")
public class Gallerie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GALLERIE_ID")
	private Long id_gallerie;

	@Column(name = "GALLERIE_FILENAME")
	private String gallerie_filename;

	@Column(name = "ID_UTILISATEUR")
	private Long id_utilisateur;

	public Long getGallerie_id() {
		return id_gallerie;
	}

	public void setGallerie_id(Long gallerie_id) {
		this.id_gallerie = gallerie_id;
	}

	public String getGallerie_filename() {
		return gallerie_filename;
	}

	public void setGallerie_filename(String gallerie_filename) {
		this.gallerie_filename = gallerie_filename;
	}

	public Long getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public Gallerie(Long gallerie_id, String gallerie_filename, Long id_utilisateur) {
		super();
		this.id_gallerie = gallerie_id;
		this.gallerie_filename = gallerie_filename;
		this.id_utilisateur = id_utilisateur;
	}

	public Gallerie() {
		super();
	}

	// GETTER

}