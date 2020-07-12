/**
 * This class contains the train schedule.
 */
package com.real.tracking.train.modal;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Elango
 */
@Entity
@Table(name = "TrainSchedule")
public class TrainSchedule {
	
	@Id
	@Column(name = "TRAIN_SCHEDULE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STATION_ID")
	private Station stationId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TRAIN_ID")
	private TrainDetail trainDetailId;
	
	private Time arrival;
	private Time depature;
	
	private String platform;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Station getStationId() {
		return stationId;
	}

	public void setStationId(Station stationId) {
		this.stationId = stationId;
	}

	public TrainDetail getTrainDetailId() {
		return trainDetailId;
	}

	public void setTrainDetailId(TrainDetail trainDetailId) {
		this.trainDetailId = trainDetailId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Time getArrival() {
		return arrival;
	}
	
	public void setArrival(Time arrival) {
		this.arrival = arrival;
	}
	
	public Time getDepature() {
		return depature;
	}
	
	public void setDepature(Time depature) {
		this.depature = depature;
	}

}
