package com.ankurmaurya.kafka.consumer_kafka_cli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsumerMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, KafkaConsumerConfig.class);
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		System.out.println("------------------");
	}

}
