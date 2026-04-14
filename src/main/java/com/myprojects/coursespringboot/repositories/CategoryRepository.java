package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
