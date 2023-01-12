package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.ImageRecette;



public interface ImageRecetteRepository extends JpaRepository<ImageRecette, Long> {

}
