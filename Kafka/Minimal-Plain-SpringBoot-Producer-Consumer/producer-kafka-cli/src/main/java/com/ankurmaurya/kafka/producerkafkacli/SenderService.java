package com.ankurmaurya.kafka.producerkafkacli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void sendMessage(int key, String msg) {
	    kafkaTemplate.send("ej-customer-transactions", String.valueOf(key), msg);
	}
	
	
}
