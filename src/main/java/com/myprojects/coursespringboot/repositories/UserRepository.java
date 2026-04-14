package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
