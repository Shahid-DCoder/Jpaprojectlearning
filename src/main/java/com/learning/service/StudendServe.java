package com.learning.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.dto.StudendDto;
import com.learning.repos.StudentRepsitry;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudendServe {
	
	
	public  StudentRepsitry studentRepsitry;
	
	@Transactional
	public StudendDto addStudendDto(StudendDto model) {
		StudendDto dto=new StudendDto();
		dto.setStudent_Fname(model.getStudent_Fname());
		dto.setStudent_Lname(model.getStudent_Lname());
		dto.setStudent_Age(model.getStudent_Age());
		dto.setStudentUsername(model.getStudentUsername());
		dto.setStudentPassword(model.getStudentPassword());
		return studentRepsitry.save(dto);
	}
	
}
