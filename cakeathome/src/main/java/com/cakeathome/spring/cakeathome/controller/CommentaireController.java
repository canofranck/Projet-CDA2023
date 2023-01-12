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

import com.cakeathome.spring.cakeathome.dao.CommentaireDao;

import com.cakeathome.spring.cakeathome.domain.Commentaire;


@RestController
@RequestMapping
@CrossOrigin("*")
public class CommentaireController {
	@Autowired
	CommentaireDao commentaireDao;
	
	@GetMapping("/commentaire")
	public List<Commentaire> getAllCommentaires(@Validated @RequestBody(required = false) Commentaire commentaire) {
		return commentaireDao.getCommentaires();	
}
	@PostMapping("/commentaire")
	public Commentaire createCommentaire(@Validated @RequestBody(required = false) Commentaire commentaire) {
		return commentaireDao.saveCommentaire(commentaire);
	
}
	@GetMapping("/commentaire/{IdCommentaire}")
	public ResponseEntity findcommentaireById(@PathVariable(name = "IdCommentaire")Long idcommentaire){
		if (idcommentaire == null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Commentaire commentaire= commentaireDao.getCommentaireByID(idcommentaire);
		
		if (commentaire == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(commentaire); 
		
	}
	
}