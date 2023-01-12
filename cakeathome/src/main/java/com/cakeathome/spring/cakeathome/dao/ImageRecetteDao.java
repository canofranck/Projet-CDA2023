package com.cakeathome.spring.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cakeathome.spring.cakeathome.domain.ImageRecette;

import com.cakeathome.spring.cakeathome.repository.IImageRecetteRepository;

@Service
public class ImageRecetteDao {
	@Autowired
	 IImageRecetteRepository imageRecetteRepository;
	// Liste Image

	public List<ImageRecette> getImageRecettes() {
		return imageRecetteRepository.findAll();
	}
	
	
	// create une image recette
	public ImageRecette saveImageRecette(ImageRecette imageRecette) {
		return imageRecetteRepository.save(imageRecette);
	}

	// recupere une image par ID 
	public ImageRecette getImageRecetteByID(Long IdImageEtape) {
		return imageRecetteRepository.findById(IdImageEtape).get();
	}
	// Delete une image recette
	
	public void deleteImageRecette(ImageRecette imageRecette) {
		imageRecetteRepository.delete(imageRecette);
	}

	// modifier une image recette
	public ImageRecette updateImageRecette(ImageRecette imageRecette) {
		return imageRecetteRepository.save(imageRecette);
		
	}
}
