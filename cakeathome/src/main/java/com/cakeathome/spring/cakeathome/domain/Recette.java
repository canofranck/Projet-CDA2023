package com.cakeathome.spring.cakeathome.domain;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name="RECETTE")
public class Recette  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDRECETTE")
	private Long Idrecette;
	
	@Column(name = "AUTEUR")
	private Long Auteur;
	
	@Column(name = "TITRE")
	private String Titre;
	
	@Column(name = "DATERECETTE")
	private Date DateRecette;
	
	@Column(name = "DESCRIPTION")
	private String Description;
	
	@Column(name = "CATEGORIE")
	private String Categorie;
	
	@Column(name = "NIVEAUDIFFICULTE")
	private String NiveauDifficulte;
	
	@Column(name = "TEMPSPREPARATION")
	private String TempsPreparation;
	
	@Column(name = "TEMPSCUISSON")
	private String TempsCuisson;
	
	@Column(name = "TEMPSTOTAL")
	private String TempsTotal;
	
	@Column(name = "NBPERSONNE")
	private String NbPersonne;
	
	@Column(name = "RECETTEPRENIUM")
	private boolean RecettePremium;

	public Long getIdrecette() {
		return Idrecette;
	}

	public void setIdrecette(Long idrecette) {
		Idrecette = idrecette;
	}

	public Long getAuteur() {
		return Auteur;
	}

	public void setAuteur(Long auteur) {
		Auteur = auteur;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public Date getDateRecette() {
		return DateRecette;
	}

	public void setDateRecette(Date dateRecette) {
		DateRecette = dateRecette;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	public String getNiveauDifficulte() {
		return NiveauDifficulte;
	}

	public void setNiveauDifficulte(String niveauDifficulte) {
		NiveauDifficulte = niveauDifficulte;
	}

	public String getTempsPreparation() {
		return TempsPreparation;
	}

	public void setTempsPreparation(String tempsPreparation) {
		TempsPreparation = tempsPreparation;
	}

	public String getTempsCuisson() {
		return TempsCuisson;
	}

	public void setTempsCuisson(String tempsCuisson) {
		TempsCuisson = tempsCuisson;
	}

	public String getTempsTotal() {
		return TempsTotal;
	}

	public void setTempsTotal(String tempsTotal) {
		TempsTotal = tempsTotal;
	}

	public String getNbPersonne() {
		return NbPersonne;
	}

	public void setNbPersonne(String nbPersonne) {
		NbPersonne = nbPersonne;
	}

	public boolean isRecettePremium() {
		return RecettePremium;
	}

	public void setRecettePremium(boolean recettePremium) {
		RecettePremium = recettePremium;
	}

	public Recette(Long idrecette, Long auteur, String titre, Date dateRecette, String description, String categorie,
			String niveauDifficulte, String tempsPreparation, String tempsCuisson, String tempsTotal, String nbPersonne,
			boolean recettePremium) {
		super();
		Idrecette = idrecette;
		Auteur = auteur;
		Titre = titre;
		DateRecette = dateRecette;
		Description = description;
		Categorie = categorie;
		NiveauDifficulte = niveauDifficulte;
		TempsPreparation = tempsPreparation;
		TempsCuisson = tempsCuisson;
		TempsTotal = tempsTotal;
		NbPersonne = nbPersonne;
		RecettePremium = recettePremium;
	}

	
}
