package com.acumencog.queue.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acumencog.queue.jms.JMSSender;


@RestController
@RequestMapping("/api/v1/requestmessage")
public class RequestMessageController {
	public static final Logger logger = LoggerFactory.getLogger(RequestMessageController.class);

	@Autowired
	private JMSSender sender;
	
	@GetMapping(path = "/create")
	public String sendMessage() {
		logger.info("Started: RequestMessageController - sendMessage");
		String message ="Satender Gautam";
		sender.send(message);
		return message + "I love you";
	}

}
