/**
 * This class contains the train details
 */
package com.real.tracking.train.modal;

/**
 * @author Elango
 */
public class TrainScheduleDetail {
	
	private TrainDetail trainDetail;
	private TrainSchedule trainSchedule;
	
	
	public TrainScheduleDetail(TrainDetail trainDetail, TrainSchedule trainSchedule) {
		this.trainDetail = trainDetail;
		this.trainSchedule = trainSchedule;
	}
	
	public TrainDetail getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}
	public TrainSchedule getTrainSchedule() {
		return trainSchedule;
	}
	public void setTrainSchedule(TrainSchedule trainSchedule) {
		this.trainSchedule = trainSchedule;
	}
	
	
	
}
