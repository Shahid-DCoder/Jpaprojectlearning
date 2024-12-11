package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.StudendDto;
import com.learning.repos.StudentRepsitry;
import com.learning.service.StudendServe;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/student")
@RestController
public class StudentCtrl {
	
	@Autowired
	public StudendServe studendServe;
	
	@Autowired
	public StudentRepsitry studentRepsitry;
	
	@PostMapping(value="/add", headers="Accept=application/json")
	public StudendDto addStudendDto(@ModelAttribute StudendDto model) {
		return studendServe.addStudendDto(model);
	}
}
