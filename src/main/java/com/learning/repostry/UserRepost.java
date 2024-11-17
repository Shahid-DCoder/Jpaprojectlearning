package com.learning.repostry;

import org.springframework.data.repository.CrudRepository;

import com.learning.userEntity.Uentitys;

public interface UserRepost extends CrudRepository<Uentitys, Integer> {

}
