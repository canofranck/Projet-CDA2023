package com.cakeathome.spring.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.spring.cakeathome.domain.Abonnement;

public interface IAbonnementRepository extends JpaRepository<Abonnement, Long> {

}
