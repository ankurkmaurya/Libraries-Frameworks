package com.ankurmaurya.kafka.consumer_kafka_cli;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverService {

	@KafkaListener(topics = "ej-customer-transactions", groupId = "groupId1")
	public void listenMessage(String message) {
	    System.out.println("< " + message);
	}
	
}
