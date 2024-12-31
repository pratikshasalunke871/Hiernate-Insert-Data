package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	private int stud_id;
	private String stud_name;
	private String stud_city;
	private int stud_age;

	public Students() {

	}

	public Students(int stud_id, String stud_name, String stud_city, int stud_age) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_city = stud_city;
		this.stud_age = stud_age;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_city() {
		return stud_city;
	}

	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}

	public int getStud_age() {
		return stud_age;
	}

	public void setStud_age(int stud_age) {
		this.stud_age = stud_age;
	}

	@Override
	public String toString() {
		return "Students [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_city=" + stud_city + ", stud_age="
				+ stud_age + "]";
	}

}
