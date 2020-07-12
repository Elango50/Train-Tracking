package com.real.tracking.train.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.tracking.train.exception.StationException;
import com.real.tracking.train.modal.Station;
import com.real.tracking.train.modal.TrainDetail;
import com.real.tracking.train.repository.TrainScheduleRepository;
import com.real.tracking.train.util.StationUtil;

@RestController
@RequestMapping("/api/train")
public class TrainController {

	@Autowired
	private StationUtil stationUtil;
	
	@Autowired
	private TrainScheduleRepository trainScheduleRepo;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/findTrain/{stationCode}")
    public ResponseEntity<List<TrainDetail>> findTrain(@PathVariable(value = "stationCode") String stationCode) throws RuntimeException {
		
		logger.debug("TrainController >> findTrain >> FromStation : " + stationCode);
		List<TrainDetail> trainList = null;
		
		try {
			
			Station station = this.stationUtil.getStationDetail(stationCode);
			
			if (station == null) 
				throw new StationException(stationCode, "Station Not Found.");
				
			trainList = this.trainScheduleRepo.getAvailableTrainDetails(station);
			
			logger.debug("TrainController >> findTrain >> FromStation : " + stationCode);
				
		} catch (Exception e) {
			//TODO multilevel cache..
			logger.error("TrainController >> findTrain >> Failed due to : " + e.getMessage());
			throw e;
		}
		
        return ResponseEntity.ok().body(trainList);
    }

}
