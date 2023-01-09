package tn.examen.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.examen.spring.entities.Evenement;
import tn.examen.spring.entities.Logistique;
import tn.examen.spring.entities.Participant;
import tn.examen.spring.repository.EvenementRepository;
import tn.examen.spring.repository.LogistiqueRepository;
import tn.examen.spring.repository.ParticipantRepository;


@Service
@Slf4j
public class ExamenService {

	@Autowired
	ParticipantRepository participantRepo;
	@Autowired
	EvenementRepository evenementRepo;
	@Autowired
	LogistiqueRepository logistiqueRepo;
	
	public Participant ajouterParticipant(Participant p) {
		return participantRepo.save(p);
	}

	public Evenement ajoutAffecterEventParticp(Evenement e) {
		return  evenementRepo.save(e);
	}
	
	public Logistique ajouterAffectLogEvnm(Logistique L , String descriptionEvnmt) {
		Evenement e = evenementRepo.getEvent(descriptionEvnmt);
		e.getLogistiques().add(L);
		return logistiqueRepo.save(L);
		
	}
	/*
	public List<Logistique> getLogistiqueDate(Date DateDeb, Date DateFin){
		
		return logistiqueRepo.getLogisbydate(DateDeb, DateFin);
	}*/
	
	public List<Participant> getParReservLogis(){
		List<Participant> participants = participantRepo.findAll();
		List<Participant> listfinal = new ArrayList<>();
	
		for(Participant p : participants) {
			if (p.getEvenements().size()!=0 ) {
			listfinal.add(p);	
			}
		}
		return listfinal;
		
		
	}
	
	@Scheduled(fixedRate = 1000)
	public void calculCout() {
	List<Evenement> listevents= evenementRepo.findAll();
	float somme =0;
	for(Evenement e : listevents) {
		for(Logistique lo : e.getLogistiques()) {
			somme += lo.getPrixUnit();
			
		}
		e.setCount(somme);
		log.info("///// L'evenement"+e.getDescription()+"de cout"+e.getCount());
	}
	
	
	}
	

}
