package com.cakeathome.spring.cakeathome.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name="RECETTE")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_recette")

public class Recette  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_RECETTE")
	private Long id_recette;
	
	
	@Column(name = "TITRE_RECETTE")
	private String titre_recette;
	
	@Column(name = "DATE_RECETTE")
	private Date date_recette;
	
	@Column(name = "DESCRIPTION_RECETTE")
	private String description_recette;
	
	@Column(name = "CATEGORIE_RECETTE")
	private String categorie_recette;
	
	@Column(name = "NIVEAUDIFFICULTE_RECETTE")
	private String niveaudifficulte_recette;
	
	@Column(name = "TEMPSPREPARATION_RECETTE")
	private String tempspreparation_recette;
	
	@Column(name = "TEMPSCUISSON_RECETTE")
	private String tempscuisson_recette;
	
	@Column(name = "TEMPSTOTAL_RECETTE")
	private String tempstotal_recette;
	
	@Column(name = "NBPERSONNE_RECETTE")
	private String nbpersonne_recette;
	
	@Column(name = "RECETTEPRENIUM_RECETTE")
	private boolean recettepremium_recette;
	
	//ASSOCIATION
	
	/*
	 * @ManyToOne(cascade = CascadeType.PERSIST)
	 * 
	 * @JoinColumn(name = "IdUtilisateur", nullable=false)
	 */
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "auteur", nullable=false, referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinTable(name = "recette_ingredient", joinColumns = @JoinColumn(name = "id_recette"), inverseJoinColumns = @JoinColumn(name = "id_ingredient"))
		private List<Ingredient> ingredients= new ArrayList<>();
	



	public Recette() {
		super();
	}

	
	public Recette(Long id_recette, String titre_recette, Date date_recette, String description_recette,
			String categorie_recette, String niveaudifficulte_recette, String tempspreparation_recette,
			String tempscuisson_recette, String tempstotal_recette, String nbpersonne_recette,
			boolean recettepremium_recette, Utilisateur utilisateur, List<Ingredient> ingredients) {
		super();
		this.id_recette = id_recette;
		this.titre_recette = titre_recette;
		this.date_recette = date_recette;
		this.description_recette = description_recette;
		this.categorie_recette = categorie_recette;
		this.niveaudifficulte_recette = niveaudifficulte_recette;
		this.tempspreparation_recette = tempspreparation_recette;
		this.tempscuisson_recette = tempscuisson_recette;
		this.tempstotal_recette = tempstotal_recette;
		this.nbpersonne_recette = nbpersonne_recette;
		this.recettepremium_recette = recettepremium_recette;
		this.utilisateur = utilisateur;
		this.ingredients = ingredients;
	}


	public Long getId_recette() {
		return id_recette;
	}

	public void setId_recette(Long id_recette) {
		this.id_recette = id_recette;
	}

	public String getTitre_recette() {
		return titre_recette;
	}

	public void setTitre_recette(String titre_recette) {
		this.titre_recette = titre_recette;
	}

	public Date getDate_recette() {
		return date_recette;
	}

	public void setDate_recette(Date date_recette) {
		this.date_recette = date_recette;
	}

	public String getDescription_recette() {
		return description_recette;
	}

	public void setDescription_recette(String description_recette) {
		this.description_recette = description_recette;
	}

	public String getCategorie_recette() {
		return categorie_recette;
	}

	public void setCategorie_recette(String categorie_recette) {
		this.categorie_recette = categorie_recette;
	}

	public String getNiveaudifficulte_recette() {
		return niveaudifficulte_recette;
	}

	public void setNiveaudifficulte_recette(String niveaudifficulte_recette) {
		this.niveaudifficulte_recette = niveaudifficulte_recette;
	}

	public String getTempspreparation_recette() {
		return tempspreparation_recette;
	}

	public void setTempspreparation_recette(String tempspreparation_recette) {
		this.tempspreparation_recette = tempspreparation_recette;
	}

	public String getTempscuisson_recette() {
		return tempscuisson_recette;
	}

	public void setTempscuisson_recette(String tempscuisson_recette) {
		this.tempscuisson_recette = tempscuisson_recette;
	}

	public String getTempstotal_recette() {
		return tempstotal_recette;
	}

	public void setTempstotal_recette(String tempstotal_recette) {
		this.tempstotal_recette = tempstotal_recette;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public String getNbpersonne_recette() {
		return nbpersonne_recette;
	}

	public void setNbpersonne_recette(String nbpersonne_recette) {
		this.nbpersonne_recette = nbpersonne_recette;
	}

	public boolean isRecettepremium_recette() {
		return recettepremium_recette;
	}

	public void setRecettepremium_recette(boolean recettepremium_recette) {
		this.recettepremium_recette = recettepremium_recette;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	
	
	
	// GETTER
	
	

	
	
}
