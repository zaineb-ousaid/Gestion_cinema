package com.enset.tp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enset.tp.demo.entities.Ville;
@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long>{

}
