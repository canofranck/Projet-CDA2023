package com.cakeathome.spring.cakeathome.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.Gallerie;



public interface IGallerieRepository extends JpaRepository<Gallerie, Long>{

}