package com.cnsblog.auth.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cnsblog.auth.user.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.userName = :username")
	User findByUsername(@Param("username") String username);
}
