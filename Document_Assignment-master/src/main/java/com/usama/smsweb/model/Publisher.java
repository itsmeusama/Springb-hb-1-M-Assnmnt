package com.usama.smsweb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pub_id;
	
	private String name;
	
	@ManyToMany(mappedBy="publishers")
	@JsonIgnore
	private List<Document> documents;

	public Integer getPub_id() {
		return pub_id;
	}

	public void setPub_id(Integer pub_id) {
		this.pub_id = pub_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
}
