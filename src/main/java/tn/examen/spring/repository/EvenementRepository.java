package tn.examen.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.examen.spring.entities.Evenement;
@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

	@Query("Select c from Evenement c where c.description=:description")
	Evenement getEvent(@Param("description") String description) ;
	
	
}
