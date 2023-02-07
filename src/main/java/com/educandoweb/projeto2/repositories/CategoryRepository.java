package com.educandoweb.projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
