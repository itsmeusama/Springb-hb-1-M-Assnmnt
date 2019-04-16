package com.usama.smsweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usama.smsweb.model.Document;
//import com.example.SpringWork.service.CardService;
import com.usama.smsweb.service.DocumentService;

@RestController
@RequestMapping(value = "/book")
public class DocumentController {
	@Autowired
	DocumentService  documentService;
	
	@RequestMapping(value = "/document",method = RequestMethod.POST)
	public Document save(@RequestBody Document document) {
		return documentService.save(document);
	}

}