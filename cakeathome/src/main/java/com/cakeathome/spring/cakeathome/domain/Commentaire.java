package com.cakeathome.spring.cakeathome.domain;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="COMMENTAIRE")

public class Commentaire  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCOMMENTAIRE")
	private long IdCommentaire;
	@Column(name = "IDUTILISATEURCOMMENTAIRE")
	private long IdUtilisateurCommentaire;
	@Column(name = "IDRECETTECOMMENTAIRE")
	private long IdRecetteCommentaire;
	@Column(name = "COMMENTAIRE")
	private String Commentaire;
	@Column(name = "IMAGECOMMENTAIRE")
	private String imageCommentaire;
	@Column(name = "NOTECOMMENTAIRE")
	private int NoteCommentaire;
	@Column(name = "DATECOMMENTAIRE")
	private Date dateCommentaire;
	
	
	public long getIdCommentaire() {
		return IdCommentaire;
	}
	public void setIdCommentaire(long idCommentaire) {
		IdCommentaire = idCommentaire;
	}
	public long getIdUtilisateurCommentaire() {
		return IdUtilisateurCommentaire;
	}
	public void setIdUtilisateurCommentaire(long idUtilisateurCommentaire) {
		IdUtilisateurCommentaire = idUtilisateurCommentaire;
	}
	public long getIdRecetteCommentaire() {
		return IdRecetteCommentaire;
	}
	public void setIdRecetteCommentaire(long idRecetteCommentaire) {
		IdRecetteCommentaire = idRecetteCommentaire;
	}
	public String getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}
	public String getImageCommentaire() {
		return imageCommentaire;
	}
	public void setImageCommentaire(String imageCommentaire) {
		this.imageCommentaire = imageCommentaire;
	}
	public int getNoteCommentaire() {
		return NoteCommentaire;
	}
	public void setNoteCommentaire(int noteCommentaire) {
		NoteCommentaire = noteCommentaire;
	}
	public Date getDateCommentaire() {
		return dateCommentaire;
	}
	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}
	public Commentaire(long idCommentaire, long idUtilisateurCommentaire, long idRecetteCommentaire, String commentaire,
			String imageCommentaire, int noteCommentaire, Date dateCommentaire) {
		super();
		IdCommentaire = idCommentaire;
		IdUtilisateurCommentaire = idUtilisateurCommentaire;
		IdRecetteCommentaire = idRecetteCommentaire;
		Commentaire = commentaire;
		this.imageCommentaire = imageCommentaire;
		NoteCommentaire = noteCommentaire;
		this.dateCommentaire = dateCommentaire;
	}
	public Commentaire() {
		super();
	}
	
	
}
