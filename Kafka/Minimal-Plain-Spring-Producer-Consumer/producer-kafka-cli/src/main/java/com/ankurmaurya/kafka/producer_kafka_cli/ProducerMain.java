package com.ankurmaurya.kafka.producer_kafka_cli;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ProducerMain 
{
	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, KafkaProducerConfig.class);
    	for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    	System.out.println("------------------");
    	SenderService msgService = (SenderService)ctx.getBean("senderService");
    	
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
    			sendMsg(msgService, keyCntr, msg);
    		}
    		
    		keyCntr++;
    	} while(!msg.equals("/e"));
    	
    	scanner.close();
    	ConfigurableApplicationContext cc = (ConfigurableApplicationContext)ctx;
    	cc.close();
    }
    
    private static void sendMsg(SenderService msgService, int key, String msg) {
    	msgService.sendMessage(String.valueOf(key), msg);
    }
    
    
    
}
