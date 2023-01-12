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
	@Column(name = "IDUTILISATEUR")
	private Long IdUtilisateur;
	
	@Column(name = "PSEUDO")
	private String Pseudo;
	
	@Column(name = "PASSWORD")
	private String Password;
	
	private String Genre;
	
	@Column(name = "EMAIL")
	private String Email;
	
	@Column(name = "DATEINSCRIPTION")
	private String DateInscription;
	
	@Column(name = "VILLE")
	private String Ville;
	
	@Column(name = "MESFAVORIS")
	private String MesFavoriS;
	
	public Long getIdUtilisateur() {
		return IdUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		IdUtilisateur = idUtilisateur;
	}
	public String getPseudo() {
		return Pseudo;
	}
	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDateInscription() {
		return DateInscription;
	}
	public void setDateInscription(String dateInscription) {
		DateInscription = dateInscription;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getMesFavoriS() {
		return MesFavoriS;
	}
	public void setMesFavoriS(String mesFavoriS) {
		MesFavoriS = mesFavoriS;
	}
	public Utilisateur(Long idUtilisateur, String pseudo, String password, String genre, String email,
			String dateInscription, String ville, String mesFavoriS) {
		super();
		IdUtilisateur = idUtilisateur;
		Pseudo = pseudo;
		Password = password;
		Genre = genre;
		Email = email;
		DateInscription = dateInscription;
		Ville = ville;
		MesFavoriS = mesFavoriS;
	}
	
	
	
}
