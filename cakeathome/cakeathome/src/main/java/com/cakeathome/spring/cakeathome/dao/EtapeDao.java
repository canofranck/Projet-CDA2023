package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.spring.cakeathome.domain.Etape;

import com.cakeathome.spring.cakeathome.repository.IEtapeRepository;

@Service
public class EtapeDao {
	@Autowired
	IEtapeRepository etapeRepository;

	// List Etape

	public List<Etape> getEtapes() {
		return etapeRepository.findAll();
	}

	// create etape
	public Etape saveEtape(Etape etape) {
		return etapeRepository.save(etape);
	}

	// get etape by ID
	public Etape getEtapeByID(Long id_etape) {
		return etapeRepository.findById(id_etape).get();
	}
	// Delete Etape

	public void deleteEtape(Etape etape) {
		etapeRepository.delete(etape);
	}

	// Update Etape

	public Etape updateEtape(Etape etape) {
		return etapeRepository.save(etape);

	}
}
