package com.bootcamp.elasticsearch.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class IndexController {
	
	private final static Logger Logger = LoggerFactory.getLogger(IndexController.class);

	
	private Long contaorIntentos = 0L;
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		Logger.info("LLamada al enddpoint inicial.");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola");
				
	}
	
}
