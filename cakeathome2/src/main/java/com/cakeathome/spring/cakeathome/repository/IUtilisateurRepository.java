package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.Utilisateur;


public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
