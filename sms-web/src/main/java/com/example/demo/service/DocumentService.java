package com.example.demo.service;


import com.example.demo.model.Card;
import com.example.demo.model.Document;


public interface DocumentService {
	
Document save(Document document);
	
Document fetch();
	
Document fetch(Document document);

Card savec(Card card);

}