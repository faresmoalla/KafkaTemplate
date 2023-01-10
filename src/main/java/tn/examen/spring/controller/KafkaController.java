package tn.examen.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class KafkaController {
	
	
@Autowired
KafkaTemplate<String, String> kafkaTemplate;

private static final String topic = "fares-topic";

@GetMapping("/publish/{message}")
public String publishMessage(@PathVariable("message")String  message) {
	 kafkaTemplate.send(topic, message);
	return "Publish successfully";
	
}
	
	
}
