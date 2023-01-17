package com.cakeathome.spring.cakeathome.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="UTILISATEUR")
public class Utilisateur  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UTILISATEUR")
	private Long id_utilisateur;
	
	
	@Column(name = "PSEUDO_UTILISATEUR")
	private String pseudo_utilisateur;
	
	@Column(name = "PASSWORD_UTILISATEUR")
	private String password_utilisateur;
	
	@Column(name = "GENRE_UTILISATEUR")
	private String genre;
	
	@Column(name = "EMAIL_UTILISATEUR")
	private String email_utilisateur;
	
	@Column(name = "DATEINSCRIPTION_UTILISATEUR")
	private String dateInscription_utilisateur;
	
	@Column(name = "VILLE_UTILISATEUR")
	private String ville_utilisateur;
	
	@Column(name = "MESFAVORIS_UTILISATEUR")
	private String mesfavoris_utilisateur;

	
	

	public Long getId_utilisateur() {
		return id_utilisateur;
	}


	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}


	public String getPseudo_utilisateur() {
		return pseudo_utilisateur;
	}


	public void setPseudo_utilisateur(String pseudo_utilisateur) {
		this.pseudo_utilisateur = pseudo_utilisateur;
	}


	public String getPassword_utilisateur() {
		return password_utilisateur;
	}


	public void setPassword_utilisateur(String password_utilisateur) {
		this.password_utilisateur = password_utilisateur;
	}


	

	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getEmail_utilisateur() {
		return email_utilisateur;
	}


	public void setEmail_utilisateur(String email_utilisateur) {
		this.email_utilisateur = email_utilisateur;
	}


	public String getDateInscription_utilisateur() {
		return dateInscription_utilisateur;
	}


	public void setDateInscription_utilisateur(String dateInscription_utilisateur) {
		this.dateInscription_utilisateur = dateInscription_utilisateur;
	}


	public String getVille_utilisateur() {
		return ville_utilisateur;
	}


	public void setVille_utilisateur(String ville_utilisateur) {
		this.ville_utilisateur = ville_utilisateur;
	}


	public String getMesfavoris_utilisateur() {
		return mesfavoris_utilisateur;
	}


	public void setMesfavoris_utilisateur(String mesfavoris_utilisateur) {
		this.mesfavoris_utilisateur = mesfavoris_utilisateur;
	}


	public Utilisateur() {
		super();
	}


	public Utilisateur(Long id_utilisateur, String pseudo_utilisateur, String password_utilisateur, String genre,
			String email_utilisateur, String dateInscription_utilisateur, String ville_utilisateur,
			String mesfavoris_utilisateur) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.pseudo_utilisateur = pseudo_utilisateur;
		this.password_utilisateur = password_utilisateur;
		this.genre = genre;
		this.email_utilisateur = email_utilisateur;
		this.dateInscription_utilisateur = dateInscription_utilisateur;
		this.ville_utilisateur = ville_utilisateur;
		this.mesfavoris_utilisateur = mesfavoris_utilisateur;
	}

	


	

	
	
	
}
