package com.learning.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.dto.StudendDto;

@Repository
public interface StudentRepsitry extends JpaRepository<StudendDto, Integer>{

}
