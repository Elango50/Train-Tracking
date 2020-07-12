package com.real.tracking.train.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public StationException(String stationCode, String message) {
        super(message + " >> " + stationCode);
        logger.error(message + " >> " + stationCode);
    }

}
