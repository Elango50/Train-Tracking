package com.real.tracking.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.real.tracking.train.modal.TrainDetail;

@Repository
public interface TrainDetailRepository extends JpaRepository<TrainDetail, Long> {

}
