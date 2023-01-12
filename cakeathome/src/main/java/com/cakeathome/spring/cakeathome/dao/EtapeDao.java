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
	// Liste Etape

	public List<Etape> getEtapes() {
		return etapeRepository.findAll();
	}
	
	
	// create une etape
	public Etape saveEtape(Etape etape) {
		return etapeRepository.save(etape);
	}

	// recupere une etape par ID 
	public Etape getEtapeByID(Long IdEtape) {
		return etapeRepository.findById(IdEtape).get();
	}
	// Delete une Etape
	
	public void deleteEtape(Etape etape) {
		etapeRepository.delete(etape);
	}

	// modifier une Etape
	
	public Etape updateEtape(Etape etape) {
		return etapeRepository.save(etape);
		
	}
}
