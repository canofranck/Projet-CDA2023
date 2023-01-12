package com.cakeathome.spring.cakeathome.domain;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name="ABONNEMENT")
public class Abonnement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDABONNEMENT")
	private long IdAbonnement;
	
	@Column(name = "IDUTILISATEUR")
	private long IdUtilisateur;
	
	@Column(name = "ABONNEMENTPRIS")
	private boolean AbonnementPris;
	
	@Column(name = "ABONNEMENTDATEDEBUT")
	private Date AbonnementDateDebut;
	
	@Column(name = "ABONNEMENTDUREE")
	private int AbonnementDuree;

	public long getIdAbonnement() {
		return IdAbonnement;
	}

	public void setIdAbonnement(long idAbonnement) {
		IdAbonnement = idAbonnement;
	}

	public long getIdUtilisateur() {
		return IdUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		IdUtilisateur = idUtilisateur;
	}

	public boolean isAbonnementPris() {
		return AbonnementPris;
	}

	public void setAbonnementPris(boolean abonnementPris) {
		AbonnementPris = abonnementPris;
	}

	public Date getAbonnementDateDebut() {
		return AbonnementDateDebut;
	}

	public void setAbonnementDateDebut(Date abonnementDateDebut) {
		AbonnementDateDebut = abonnementDateDebut;
	}

	public int getAbonnementDuree() {
		return AbonnementDuree;
	}

	public void setAbonnementDuree(int abonnementDuree) {
		AbonnementDuree = abonnementDuree;
	}

	public Abonnement(long idAbonnement, long idUtilisateur, boolean abonnementPris, Date abonnementDateDebut,
			int abonnementDuree) {
		super();
		IdAbonnement = idAbonnement;
		IdUtilisateur = idUtilisateur;
		AbonnementPris = abonnementPris;
		AbonnementDateDebut = abonnementDateDebut;
		AbonnementDuree = abonnementDuree;
	}
	
	

}
