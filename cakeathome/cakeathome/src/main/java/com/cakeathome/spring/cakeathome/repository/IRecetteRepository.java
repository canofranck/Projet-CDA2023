package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.Recette;


public interface IRecetteRepository extends JpaRepository<Recette, Long>{

}
