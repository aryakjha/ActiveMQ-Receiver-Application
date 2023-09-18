package com.venture.receiver;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;

@Component
@EnableJms
public class ReceiverClass {
	
	@JmsListener(destination = "newQueue")
	public void listner(String message) {
		System.out.println(message);
	}
}
