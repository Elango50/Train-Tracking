package com.real.tracking.train.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.real.tracking.train.modal.Station;
import com.real.tracking.train.modal.TrainDetail;

@Repository
public interface TrainScheduleRepository {
	
	List<TrainDetail> getAvailableTrainDetails(Station stationCode);
}
