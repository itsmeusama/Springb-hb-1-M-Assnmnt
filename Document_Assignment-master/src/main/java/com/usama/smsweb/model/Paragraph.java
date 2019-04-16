package com.usama.smsweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Paragraph {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer para_id;
	
	private String name;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="sec_id")
	private Section section;

	public Integer getPara_id() {
		return para_id;
	}

	public void setPara_id(Integer para_id) {
		this.para_id = para_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	
}
