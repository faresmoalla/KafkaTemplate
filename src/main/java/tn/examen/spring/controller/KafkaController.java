package tn.examen.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.examen.spring.entities.Participant;

@RestController

public class KafkaController {
	
	
@Autowired
KafkaTemplate<String, Participant> kafkaTemplate;

private static final String topic = "fares-topic";

@PostMapping("/publish")
public String publishMessage(@RequestBody Participant participant) {
	 kafkaTemplate.send(topic, participant);
	return "Publish successfully";
	
}
	
	
}
