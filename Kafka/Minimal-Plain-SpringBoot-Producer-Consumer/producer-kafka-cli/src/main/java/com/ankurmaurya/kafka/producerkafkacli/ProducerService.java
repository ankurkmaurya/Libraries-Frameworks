package com.ankurmaurya.kafka.producerkafkacli;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProducerService {

	@Autowired
	private SenderService senderService;

	public void runProducerService() {
		System.out.println("Please provide Message");
    	System.out.println("Enter /e for exit");
    	System.out.println("------------------");
    	int keyCntr=1;
    	String msg = "";
    	Scanner scanner = new Scanner(System.in);
    	do {
    		System.out.print("> ");
    		msg = scanner.nextLine();
    		
    		if(!msg.equals("/e")) {
    			senderService.sendMessage(keyCntr, msg);
    		}
    		
    		keyCntr++;
    	} while(!msg.equals("/e"));
    	
    	scanner.close();
	}
	
	
	
}
