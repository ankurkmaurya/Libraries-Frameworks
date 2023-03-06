package com.ankurmaurya.kafka.producerkafkacli;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProducerKafkaCliApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ProducerKafkaCliApplication.class, args);

		ProducerService producerService = (ProducerService)ctx.getBean("producerService");
		producerService.runProducerService();
		
	}

}
