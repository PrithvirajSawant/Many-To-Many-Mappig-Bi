package com.jsp.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="subjects_info")
public class Subjects_S {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int duration;
	private String trinerName;
	@ManyToMany(mappedBy = "subjects")
	private List<Students_S> students;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getTrinerName() {
		return trinerName;
	}
	public void setTrinerName(String trinerName) {
		this.trinerName = trinerName;
	}
	public List<Students_S> getStudents() {
		return students;
	}
	public void setStudents(List<Students_S> students) {
		this.students = students;
	}
	
	
	

}
