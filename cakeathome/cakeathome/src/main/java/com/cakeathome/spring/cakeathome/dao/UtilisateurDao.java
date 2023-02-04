package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Utilisateur;
import com.cakeathome.spring.cakeathome.repository.IUtilisateurRepository;


@Service
public class UtilisateurDao {
	@Autowired
	IUtilisateurRepository utilisateurRepository;

	// List Utilisateur

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurRepository.findAll();
	}
	
	
	// create  utilisateur
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	// Get  utilisateur by ID 
	public Utilisateur getUtilisateurByID(Long id_utilisateur) {
		return utilisateurRepository.findById(id_utilisateur).get();
	}
	// Delete  Utilisateur
	
	public void deleteUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.delete(utilisateur);
	}

	// Update User
	
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}
}
