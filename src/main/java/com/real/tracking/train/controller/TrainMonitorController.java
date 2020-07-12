package com.real.tracking.train.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TrainMonitorController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

    @SubscribeMapping("/posts/{trainNumber}/get")
    public String findTrain(@DestinationVariable String trainNumber) throws InterruptedException {
		System.out.print("CALLED" + trainNumber);
		//Thread.sleep(10);
		/*TrainLocation t = new TrainLocation();
		t.setLatitude("15.154");
		t.setLongitude("175.154");*/
		String topicName  = "/topic/posts/" + trainNumber + "/get";
		int k = 1000;
		for (int i=0 ; i<=k; i++ ) {
			Thread.sleep(1000);
			this.simpMessagingTemplate.convertAndSend(topicName, i);
		}
		return "Hello";
    }
    
}
