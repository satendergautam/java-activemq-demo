package com.acumencog.queue.jms;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

public class JMSReceiver {
	private static final Logger LOGGER = LoggerFactory.getLogger(JMSReceiver.class);

	@JmsListener(destination = "foodpanda")
	public void receive(String message) {
		LOGGER.info("---------------------------------------------------------");
		LOGGER.info("received message='{}'", "MR." + message);
	}

}
