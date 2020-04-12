package com.tts.ttTwitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.ttTwitter.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
}
