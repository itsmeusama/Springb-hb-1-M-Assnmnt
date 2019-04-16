package com.usama.smsweb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Page {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	private String name;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cid")
	private Card card;

	@OneToMany(mappedBy = "page",cascade = CascadeType.ALL)
	List<Section> sections;

	
	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
