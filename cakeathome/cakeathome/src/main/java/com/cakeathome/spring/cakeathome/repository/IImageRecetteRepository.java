package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.ImageRecette;



public interface IImageRecetteRepository extends JpaRepository<ImageRecette, Long> {

}
