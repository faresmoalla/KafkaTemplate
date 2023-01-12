package tn.examen.spring.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import tn.examen.spring.entities.Participant;

@Component
public class KafkaConsumer {

	
	@KafkaListener(topics= "fares-topic", groupId = "group id")
	public void Consume(Participant p) {
		System.out.println("message"+p);
	}
}
