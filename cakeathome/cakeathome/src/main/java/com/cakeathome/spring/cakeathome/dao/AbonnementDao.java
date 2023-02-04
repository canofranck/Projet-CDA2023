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

	// get all abonnements

	public List<Abonnement> getAbonnements() {
		return abonnementRepository.findAll(); // return
												// abonnementRepository.findAll(Sort.by(Sort.Direction.ASC,"id_abonnement"));
	}

	// create abonnement

	public Abonnement saveAbonnement(Abonnement abonnement) {
		return abonnementRepository.save(abonnement);
	}

	// get un abonnement by ID

	public Abonnement getAbonnementByID(Long id_abonnement) {
		return abonnementRepository.findById(id_abonnement).get();
	}
	// Delete abonnement

	public void deleteAbonnement(Abonnement abonnement) {
		abonnementRepository.delete(abonnement);
	}

	// update abonnement

	public Abonnement updateAbonnement(Abonnement abonnement) {
		return abonnementRepository.save(abonnement);

	}
}
