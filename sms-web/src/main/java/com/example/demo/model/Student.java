package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity     //Consider all these as a table
public class Student {
	@Id     //primary key
	private Integer id;
	private String name;
	//private String city;
	
	//Address address;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	//mappedby used to tell that don't manage this
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)   // this will avoid creating the 3rd table
	//@JoinColumn(name="id")
	List<Telephone> telephones;   //why list?? -> 1-M so multivalues should be thr
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course",
			joinColumns=@JoinColumn(name="sid",referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="cid",referencedColumnName="id"))
	List<Course> course;
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
