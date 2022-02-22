package com.groupe2.freelancing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.groupe2.freelancing.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	@Query(value="Select * from users where email = ?1 and password = ?2", nativeQuery=true)
	public Users getUserForLogin(String eml, String pass);
}
