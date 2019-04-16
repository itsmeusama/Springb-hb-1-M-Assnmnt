package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Document;
import com.example.demo.service.CardService;
import com.example.demo.service.DocumentService;

@RestController
@RequestMapping(value = "/book")
public class DocumentController {
	
	@Autowired
	DocumentService  documentService;
	
	@RequestMapping(value = "/document",method = RequestMethod.POST)
	public Document save(@RequestBody Document document) {
		//System.out.println("doc controller");
		return documentService.save(document);
	}

}