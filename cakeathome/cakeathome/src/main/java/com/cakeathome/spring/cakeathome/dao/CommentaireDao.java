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

	// List Commentaire

	public List<Commentaire> getCommentaires() {
		return commentaireRepository.findAll();
	}
	
	
	// create Commentaire
	
	public Commentaire saveCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	// get Commentaire by ID 
	public Commentaire getCommentaireByID(Long id_commentaire) {
		return commentaireRepository.findById(id_commentaire).get();
	}
	// Delete Commentaire
	
	public void deleteCommentaire(Commentaire commentaire) {
		commentaireRepository.delete(commentaire);
	}

	// Update Commentaire
	
	public Commentaire updateCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
		
	}
}


