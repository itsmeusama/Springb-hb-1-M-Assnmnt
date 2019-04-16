package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Card;
import com.example.demo.model.Page;
import com.example.demo.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	CardRepository cardRepository;
	
	@Override
	public Card save(Card card) {
		// TODO Auto-generated method stub
		
		for (Page page:card.getPages()) {
			page.setCard(card);
		}
		System.out.println("hello from card");
		return cardRepository.save(card);
		
	}

}