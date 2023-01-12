package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Abonnement;
import com.cakeathome.spring.cakeathome.domain.Utilisateur;
import com.cakeathome.spring.cakeathome.repository.IAbonnementRepository;
import com.cakeathome.spring.cakeathome.repository.IUtilisateurRepository;

@Service
public class AbonnementDao {
	@Autowired
	IAbonnementRepository abonnementRepository;
	
	// Liste abonnemnts

		public List<Abonnement> getAbonnements() {
			return abonnementRepository.findAll();
		}
		
		
		// create un abonnements
		public Abonnement saveAbonnement(Utilisateur abonnementUtilisateur) {
			return abonnementRepository.save(Abonnement);
		}

		// recupere un abonnements par ID 
		public Utilisateur getUtilisateurByID(Long IdUtilisateur) {
			return utilisateurRepository.findById(IdUtilisateur).get();
		}
		// Delete un abonnements
		
		public void deleteUtilisateur(Utilisateur utilisateur) {
			utilisateurRepository.delete(utilisateur);
		}

		// modifier un abonnement
		
		public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
			return utilisateurRepository.save(utilisateur);
			
		}
	}
