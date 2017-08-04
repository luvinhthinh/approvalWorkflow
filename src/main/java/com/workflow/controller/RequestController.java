package com.workflow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.model.Request;

@RestController
@RequestMapping("/requests")
public class RequestController {
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> createRequest(@RequestBody Request req) {
		return new ResponseEntity<Void>(HttpStatus.OK);
    }
	
	@RequestMapping(method = RequestMethod.GET)
	public void getAllRequest(){
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public void retrieveRequest(@PathVariable String id){
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void closeRequest(@PathVariable String id){
		
	}

	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public void updateRequest(@RequestParam(value="action") String action, @PathVariable String id){
		
	}
	
}
