package tn.examen.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.examen.spring.entities.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

}
