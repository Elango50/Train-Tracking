/**
 * This class contains the train route details
 */
package com.real.tracking.train.modal;

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
@Table(name = "TrainRoute")
public class TrainRoute {

	@Id
	@Column(name = "TRAIN_ROUTE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int routeSeq;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STATION_ID")
	private Station station;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TRAIN_ID")
	private TrainDetail trainDetail;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getRouteSeq() {
		return routeSeq;
	}
	
	public void setRouteSeq(int routeSeq) {
		this.routeSeq = routeSeq;
	}
	
	public Station getStation() {
		return station;
	}
	
	public void setStation(Station station) {
		this.station = station;
	}
	
	public TrainDetail getTrainDetail() {
		return trainDetail;
	}
	
	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}

}
