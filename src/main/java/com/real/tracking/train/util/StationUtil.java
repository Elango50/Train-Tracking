package com.real.tracking.train.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.real.tracking.train.modal.Station;
import com.real.tracking.train.repository.StationRepository;

@Component
public class StationUtil {
	
	@Autowired
	private StationRepository stationRepository;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private List<Station> stationList = new ArrayList<Station>();

	public Station getStationDetail(final String stationCode) {
		return this.stationList.stream().filter(st -> 
				st.getStationCode().equals(stationCode.toUpperCase()))
					.findAny().orElse(null);
	}
	
	@PostConstruct
    public void loadStations() {
        this.stationList = this.stationRepository.findAll();
        logger.info("All stations are loaded successfully.");
    }

}
