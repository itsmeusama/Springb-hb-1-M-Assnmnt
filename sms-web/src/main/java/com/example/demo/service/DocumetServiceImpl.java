package com.example.demo.service;


import javax.rmi.CORBA.StubDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Card;
import com.example.demo.model.Document;
import com.example.demo.model.Page;
import com.example.demo.repository.DocumentRepository;
import com.example.demo.repository.CardRepository;


@Service
public class DocumetServiceImpl implements DocumentService {
	
	@Autowired
	DocumentRepository documentRepository;
	@Autowired
	CardRepository cardRepository;

	@Override
	public Document save(Document document) {
		// TODO Auto-generated method stub
		
		for(Card card:document.getCards()) {
			card.setDocument(document);
			
//			for(Page page:card.getPages()) {
//				page.setCard(card);
//			}
		}
		
		System.out.println("hello");
		return documentRepository.save(document);
	}
	
//	@Override
//	public Card savec(Card card) {
//		// TODO Auto-generated method stub
//		
//		for (Page page:card.getPages()) {
//			page.setCard(card);
//		}
//		System.out.println("hello from card");
//		return cardRepository.save(card);
//	}

	@Override
	public Document fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document fetch(Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card savec(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}