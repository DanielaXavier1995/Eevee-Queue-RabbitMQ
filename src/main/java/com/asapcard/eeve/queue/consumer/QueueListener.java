package com.asapcard.eeve.queue.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class QueueListener {

	@RabbitListener(queues = "queue-a")
	public void listener(String message) {
		System.out.println("Message received from queue-a: " + message);
	}
}
