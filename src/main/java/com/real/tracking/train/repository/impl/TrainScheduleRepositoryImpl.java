package com.real.tracking.train.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.real.tracking.train.modal.Station;
import com.real.tracking.train.modal.TrainDetail;
import com.real.tracking.train.repository.TrainScheduleRepository;

@Component
public class TrainScheduleRepositoryImpl implements TrainScheduleRepository {

	@PersistenceContext
    EntityManager entityManager;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TrainDetail> getAvailableTrainDetails(Station station) {
		
		try {
			
			Query query = entityManager.createQuery("SELECT td from TrainDetail td INNER JOIN TrainSchedule ts ON td.trainId = ts.trainDetailId where ts.stationId = ?1", TrainDetail.class);
	        query.setParameter(1, station);
	        return query.getResultList();
	        
		} catch (Exception e) {
			logger.error("getAvailableTrainDetails failed because of " + e);
			throw e;
		}
		
	}

}
