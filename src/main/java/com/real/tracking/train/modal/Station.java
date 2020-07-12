/**
 * This class act as a model for station details
 */
package com.real.tracking.train.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Elango
 */

@Entity
@Table(name = "Station")
public class Station {
	
	@Id
	@Column(name = "STATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stationId;

	private String stationName;
	private String stationCode;
	private String city;
	private String state;
	private String latitude;
	private String longitude;
	
	public Long getStationId() {
		return stationId;
	}

	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationCode() {
		return stationCode.toUpperCase();
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
