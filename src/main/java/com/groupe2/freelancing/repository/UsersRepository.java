package com.groupe2.freelancing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupe2.freelancing.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
