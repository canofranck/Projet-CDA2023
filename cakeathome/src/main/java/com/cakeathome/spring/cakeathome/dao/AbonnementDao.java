package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Abonnement;

import com.cakeathome.spring.cakeathome.repository.IAbonnementRepository;


@Service
public class AbonnementDao {
	@Autowired
	IAbonnementRepository abonnementRepository;
	
	// Liste abonnemnts

		public List<Abonnement> getAbonnements() {
			return abonnementRepository.findAll();
		}
		
		
		// create un abonnements
		public Abonnement saveAbonnement(Abonnement abonnementUtilisateur) {
			return abonnementRepository.save(abonnementUtilisateur);
		}

		// recupere un abonnements par ID 
		public Abonnement getAbonnementByIdAbonnement(Long IdAbonnement) {
			return abonnementRepository.findById(IdAbonnement).get();
		}
		// Delete un abonnements
		
		public void deleteAbonnement(Abonnement abonnement) {
			abonnementRepository.delete(abonnement);
		}

		// modifier un abonnement
		
		public Abonnement updateAbonnement(Abonnement abonnement) {
			return abonnementRepository.save(abonnement);
			
		}
	}
