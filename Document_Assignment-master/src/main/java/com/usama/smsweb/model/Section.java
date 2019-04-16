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
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sec_id;
	
	private String name;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "pid")
	private Page page;
	
	@OneToMany(mappedBy = "section",cascade = CascadeType.ALL)
	List<Paragraph> paragraphs;
	
	

	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public Integer getSec_id() {
		return sec_id;
	}

	public void setSec_id(Integer sec_id) {
		this.sec_id = sec_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	
}
