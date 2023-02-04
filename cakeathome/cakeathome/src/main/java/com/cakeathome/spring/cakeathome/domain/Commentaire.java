package com.cakeathome.spring.cakeathome.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "COMMENTAIRE")

public class Commentaire implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "ID_COMMENTAIRE")
	private long id_commentaire;

	@Column(name = "COMMENTAIRE")
	private String commentaire;

	@Column(name = "IMAGECOMMENTAIRE")
	private String imagecommentaire;

	@Column(name = "NOTECOMMENTAIRE")
	private int notecommentaire;

	@Column(name = "DATECOMMENTAIRE")
	private Date datecommentaire;

	// ASSOCIATION

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_recette")
	private Recette recette;

	// GETTER

	public long getId_commentaire() {
		return id_commentaire;
	}

	public void setId_commentaire(long id_commentaire) {
		this.id_commentaire = id_commentaire;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getImagecommentaire() {
		return imagecommentaire;
	}

	public void setImagecommentaire(String imagecommentaire) {
		this.imagecommentaire = imagecommentaire;
	}

	public int getNotecommentaire() {
		return notecommentaire;
	}

	public void setNotecommentaire(int notecommentaire) {
		this.notecommentaire = notecommentaire;
	}

	public Date getDatecommentaire() {
		return datecommentaire;
	}

	public void setDatecommentaire(Date datecommentaire) {
		this.datecommentaire = datecommentaire;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Recette getRecette() {
		return recette;
	}

	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	// Constructor

	public Commentaire() {
		super();
	}

	public Commentaire(long id_commentaire, String commentaire, String imagecommentaire, int notecommentaire,
			Date datecommentaire, Utilisateur utilisateur, Recette recette) {
		super();
		this.id_commentaire = id_commentaire;
		this.commentaire = commentaire;
		this.imagecommentaire = imagecommentaire;
		this.notecommentaire = notecommentaire;
		this.datecommentaire = datecommentaire;
		this.utilisateur = utilisateur;
		this.recette = recette;
	}
}
