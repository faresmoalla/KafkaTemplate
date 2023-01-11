package tn.examen.spring.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	
	@KafkaListener(topics= "fares-topic", groupId = "group id")
	public void Consume(String message ) {
		System.out.println("message"+message);
	}
}
