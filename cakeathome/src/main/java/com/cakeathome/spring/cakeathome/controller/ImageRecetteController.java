package com.cakeathome.spring.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.spring.cakeathome.dao.ImageRecetteDao;
import com.cakeathome.spring.cakeathome.domain.Abonnement;
import com.cakeathome.spring.cakeathome.domain.ImageRecette;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ImageRecetteController {

	@Autowired
	ImageRecetteDao imageRecetteDao;
	
	@GetMapping("/imagerecette")
	public List<ImageRecette> getAllImageRecettes(@Validated @RequestBody(required = false) ImageRecette imageRecette) {
		return imageRecetteDao.getImageRecettes();		
}
	@PostMapping("/imagerecette")
	public ImageRecette createImageRecette(@Validated @RequestBody(required = false) ImageRecette imageRecette) {
		return imageRecetteDao.saveImageRecette(imageRecette);
	
}
	@GetMapping("/imagerecette/{id_image_recette}")
	public ResponseEntity findimageRecetteById(@PathVariable(name = "id_image_recette")Long id_image_recette){
		if (id_image_recette == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		ImageRecette imageRecette = imageRecetteDao.getImageRecetteByID(id_image_recette);
		
		if (imageRecette == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(imageRecette); 
		
	}
	@PutMapping("/imagerecettes/{id_image_recette}")
	public ResponseEntity<ImageRecette> updateImageRecette (@Validated @PathVariable(name = "id_image_recette")Long id_image_recette, @RequestBody(required = false) ImageRecette imagerecette) {
		if (imagerecette == null) {
			return ResponseEntity.notFound().build();
			
		}
		imagerecette.setId_image_recette(id_image_recette);
		imageRecetteDao.updateImageRecette(imagerecette);
		return ResponseEntity.ok().body(imagerecette);
	}
	
	@DeleteMapping("/imagerecettes/{id_image_recette}")
	public ResponseEntity<ImageRecette> deleteImageRecette (@Validated @PathVariable(name = "id_image_recette")Long id_image_recette) {
		
		ImageRecette imagerecette = imageRecetteDao.getImageRecetteByID (id_image_recette) ;
		
		if (imagerecette == null) {
			return ResponseEntity.notFound().build();
		
	}
		imageRecetteDao.deleteImageRecette(imagerecette);
		return ResponseEntity.ok().body(imagerecette); 
	
	}
}