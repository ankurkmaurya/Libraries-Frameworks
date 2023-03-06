package com.ankurmaurya.kafka.producer_kafka_cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SenderService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	
	public void sendMessage(String key, String msg) {
	    kafkaTemplate.send("ej-customer-transactions", key, msg);
	}
	
	
}
