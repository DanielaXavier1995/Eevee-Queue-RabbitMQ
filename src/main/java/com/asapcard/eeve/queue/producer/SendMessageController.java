package com.asapcard.eeve.queue.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostMapping(path = "/")
	public ResponseEntity<String> sendMessage(@RequestBody String message) {
		rabbitTemplate.convertAndSend("", "queue-a", message);
		return ResponseEntity.ok("Message sent to the queue");
	}

}
