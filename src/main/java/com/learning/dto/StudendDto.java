package com.learning.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Jforce")
@Getter
@Setter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class StudendDto {
	
	@Id
	@GeneratedValue
	@Column(name="STUDENT_Id")
	private int id;
	
	@Column(name="STUDENT_First_Name")
	private String student_Fname;
	
	@Column(name="STUDENT_Last_Name")
	private String student_Lname;
	
	@Column(name="STUDENT_Age")
	private int student_Age;
	
	@Column(name="STUDENT_USERNAME")
	private String studentUsername;
	
	@Column(name="STUDENT_PASSWORD")
	private String studentPassword;

	public StudendDto(int id, String student_Fname, String student_Lname, int student_Age, String studentUsername,
			String studentPassword) {
		super();
		this.id = id;
		this.student_Fname = student_Fname;
		this.student_Lname = student_Lname;
		this.student_Age = student_Age;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
	}

	public StudendDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
