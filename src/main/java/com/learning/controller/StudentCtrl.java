package com.learning.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	public StudendDto addStudendDto(@RequestBody StudendDto model) {
//		System.out.println("data added successflly====>>");
		return studendServe.addStudendDto(model);
	}
	
	@GetMapping("/view")
	
//	public List<StudendDto> viewStudent(){
//		System.out.println("this is this");
//		return studentRepsitry.findAll().stream().map(
//		student -> new StudendDto(student.getId(),
//				student.getStudent_Fname(),student.getStudent_Lname(),student.getStudent_Age(),
//				student.getStudentUsername(),student.getStudentPassword())).collect(Collectors.toList());
//	}
	public List<StudendDto> viewStudent(){
		return studentRepsitry.findAll();
	}
}
