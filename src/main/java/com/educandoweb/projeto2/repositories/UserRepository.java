package com.educandoweb.projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
