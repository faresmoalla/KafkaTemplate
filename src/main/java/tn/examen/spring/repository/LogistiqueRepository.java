package tn.examen.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.examen.spring.entities.Logistique;

public interface LogistiqueRepository extends JpaRepository<Logistique, Integer> {
	/*
	@Query("SELECT c FROM Evenement c join c.logistiques b WHERE c.dateDebut between= :d1 and :d2 AND c.dateFin between= :d1 and :d2  ")
	  public List<Logistique>getLogisbydate(@Param("d1") Date fromDate,@Param("d2") Date toDate);
	*/
}
