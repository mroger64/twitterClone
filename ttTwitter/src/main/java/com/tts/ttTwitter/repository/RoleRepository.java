package com.tts.ttTwitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.ttTwitter.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);
}
