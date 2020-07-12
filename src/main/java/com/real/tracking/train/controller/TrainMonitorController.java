package com.real.tracking.train.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import com.real.tracking.train.modal.TrainDetail;
import com.real.tracking.train.modal.TrainLocation;
import com.real.tracking.train.repository.StationRepository;
import com.real.tracking.train.repository.TrainDetailRepository;

@Controller
public class TrainMonitorController {
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
	private TrainDetailRepository trainDetailRepository;
    
    @SubscribeMapping("/get/{trainId}")
    public void findTrain(@DestinationVariable String trainId) throws InterruptedException {
    	
    	Optional<TrainDetail> trainDetailOptional = this.trainDetailRepository.findById(Long.parseLong(trainId));
    	TrainLocation trainLocation = new TrainLocation();	
    	
    	if (trainDetailOptional.isPresent()) {
    		TrainDetail trainDetail = trainDetailOptional.get();
    		trainLocation.setTrainName(trainDetail.getTrainName());
    	}
		
		String topicName  = "/topic/get/" + trainId;
		
		int k = 1000;
		for (int i = 0 ; i <= k; i++ ) {
			Thread.sleep(10000);
			trainLocation.setLatitude("15.154" + i);
			trainLocation.setLongitude("175.154" + i);
			this.simpMessagingTemplate.convertAndSend(topicName, trainLocation);
		}
		
    }
    
}
