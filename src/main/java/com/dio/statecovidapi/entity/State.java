package com.dio.statecovidapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class State {

	@Id
	private String uf;
	private int uid;
	private String state;
	private int cases;
	private int deaths;
	private int suspects;
	private int refuses;
	private String datetime;
	
	
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getSuspects() {
		return suspects;
	}
	public void setSuspects(int suspects) {
		this.suspects = suspects;
	}
	public int getRefuses() {
		return refuses;
	}
	public void setRefuses(int refuses) {
		this.refuses = refuses;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	
	
	
	

}
