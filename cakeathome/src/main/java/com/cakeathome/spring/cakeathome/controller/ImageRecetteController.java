package com.cakeathome.spring.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.spring.cakeathome.dao.ImageRecetteDao;

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
	@GetMapping("/imagerecette/{IdRecette}")
	public ResponseEntity findimageRecetteById(@PathVariable(name = "IdRecette")Long idImageRecette){
		if (idImageRecette == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		ImageRecette imageRecette = imageRecetteDao.getImageRecetteByID(idImageRecette);
		
		if (imageRecette == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(imageRecette); 
		
	}
	
}