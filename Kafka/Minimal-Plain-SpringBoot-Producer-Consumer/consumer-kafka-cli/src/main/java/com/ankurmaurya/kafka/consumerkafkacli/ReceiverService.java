package com.ankurmaurya.kafka.consumerkafkacli;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

	// @KafkaListener(topics = "ej-customer-transactions", groupId = "groupId5")
	@KafkaListener(id = "grouplistener5", topicPartitions = {
			@TopicPartition(topic = "ej-customer-transactions", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0")) })
	public void listenGroup(String message) {
		System.out.println("< " + message);
	}
}
