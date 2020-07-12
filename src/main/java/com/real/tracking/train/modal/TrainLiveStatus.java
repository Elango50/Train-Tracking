package com.real.tracking.train.modal;

public class TrainLiveStatus {
	
	private TrainDetail train;
	private String latitude;
	private String longitude;
	
	
	public TrainLiveStatus(TrainDetail train, String latitude, String longitude) {
		super();
		this.train = train;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public TrainDetail getTrain() {
		return train;
	}
	
	public void setTrain(TrainDetail train) {
		this.train = train;
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
