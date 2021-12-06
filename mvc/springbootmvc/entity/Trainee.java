package com.cg.springbootmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="trainee_tbl")
@NamedQueries( {
		@NamedQuery(name="Trainee.getAllTrainees", query="Select t from Trainee t"),
		@NamedQuery(name="Trainee.getAllTraineeByDomain", query="Select t from Trainee t where t.traineeDomain=:dname")	
})

public class Trainee {
	
	@Id
	@Column(name="trainee_id")
	private int traineeId;
	
	@Column(name="trainee_name",length = 30)
	private String traineeName;
	
	@Column(name="trainee_domain", length = 20)
	private String traineeDomain;
	
	@Column(name="trainee_location", length = 30)
	private String traineeLocation;
	
	public Trainee() {
		
	}
	
	public Trainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
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
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}	
	
}
