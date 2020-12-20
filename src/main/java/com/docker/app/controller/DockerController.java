package com.docker.app.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1")
public class DockerController {

	
	@RequestMapping(value = "/Docker", method = RequestMethod.GET)
	public ResponseEntity<String> searchEmployeeById(@RequestParam String name) {
  
	return ResponseEntity.ok("Hello -docker: "+name);
	}
}

