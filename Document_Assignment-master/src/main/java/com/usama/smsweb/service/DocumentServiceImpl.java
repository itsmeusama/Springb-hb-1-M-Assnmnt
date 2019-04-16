package com.usama.smsweb.service;
import javax.rmi.CORBA.StubDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usama.smsweb.model.Card;
import com.usama.smsweb.model.Document;
import com.usama.smsweb.model.Page;
import com.usama.smsweb.model.Paragraph;
import com.usama.smsweb.model.Section;
import com.usama.smsweb.repository.DocumentRepository;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {
		
	@Autowired
	DocumentRepository documentRepository;
	//@Autowired
	//CardRepository cardRepository;

	@Override
	public Document save(Document document) {
		// TODO Auto-generated method stub
		
		for(Card card:document.getCards()) {
			card.setDocument(document);
			
			for(Page page:card.getPages()) {
				page.setCard(card);
				
				for( Section section:page.getSections()) {
					section.setPage(page);
					
					for(Paragraph paragraph:section.getParagraphs()) {
						paragraph.setSection(section);
					}
				}
			}
		}
		
		System.out.println("hello from document");
		return documentRepository.save(document);
	}
	
}
