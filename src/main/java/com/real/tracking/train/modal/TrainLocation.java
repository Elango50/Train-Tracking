/**
 * Model class for Train location
 */
package com.real.tracking.train.modal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Elango
 */
public class TrainLocation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long trainlocationId;
	
	private String trainName;
	private String latitude;
	private String longitude;
	
	public String getTrainName() {
		return trainName;
	}
	
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
