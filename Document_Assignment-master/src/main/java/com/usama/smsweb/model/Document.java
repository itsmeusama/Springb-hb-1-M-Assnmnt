package com.usama.smsweb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy = "document",cascade = CascadeType.ALL)
	List<Card> cards;
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(
				name="Document_Publisher",
				joinColumns= { @JoinColumn(name="did",referencedColumnName="id")},
				inverseJoinColumns = { @JoinColumn(name="pid", referencedColumnName="pub_id")}
				)
	List<Publisher> publishers;
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
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
	
	
}
