package com.cg.anurag.spmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	@Id
	@Column(name="trainee_id")
	private int traineeId;
	@Column(name="trainee_name")
	private String traineeName;
	@Column(name="trainee_location")
	private String traineeLocation;
	@Column(name="trainee_domain")
	private String traineeDomain;
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int traineeId, String traineeName, String traineeLocation, String traineeDomain) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeLocation = traineeLocation;
		this.traineeDomain = traineeDomain;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	

}
