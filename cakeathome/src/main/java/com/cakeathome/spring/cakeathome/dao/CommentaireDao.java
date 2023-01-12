package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Commentaire;

import com.cakeathome.spring.cakeathome.repository.ICommentaireRepository;

@Service
public class CommentaireDao {
	@Autowired
	ICommentaireRepository commentaireRepository;

	// Liste Utilisateur

	public List<Commentaire> getCommentaires() {
		return commentaireRepository.findAll();
	}
	
	
	// create un utilisateur
	public Commentaire saveCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	// recupere un utilisateur par ID 
	public Commentaire getCommentaireByID(Long IdUtilisateurCommentaire) {
		return commentaireRepository.findById(IdUtilisateurCommentaire).get();
	}
	// Delete un Utilisateur
	
	public void deleteCommentaire(Commentaire commentaire) {
		commentaireRepository.delete(commentaire);
	}

	// modifier un User
	
	public Commentaire updateCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
		
	}
}


