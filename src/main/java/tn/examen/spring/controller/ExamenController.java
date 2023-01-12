package tn.examen.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import tn.examen.spring.entities.Evenement;
import tn.examen.spring.entities.Logistique;
import tn.examen.spring.entities.Participant;
import tn.examen.spring.service.ExamenService;

@RestController
@RequestMapping("/examen")
public class ExamenController {

@Autowired
ExamenService examenService;
	
@PostMapping("/add-participant")
@ResponseBody
public Participant addParticipant(@RequestBody Participant c)
{
	return examenService.ajouterParticipant(c);

}

@PostMapping("/add-evenement")
@ResponseBody
public Evenement addEvenement(@RequestBody Evenement e)
{
	return examenService.ajoutAffecterEventParticp(e);

}


@PutMapping("/ajouter-logistique/{description}")
@ResponseBody
public Logistique ajouterLogistique(@RequestBody Logistique f,@PathVariable("description") String description)
{
	 return examenService.ajouterAffectLogEvnm(f,description);

}	


@GetMapping("/getParReserLog")
public List<Participant> nombre()	{
	return examenService.getParReservLogis();
	
	
}






}
