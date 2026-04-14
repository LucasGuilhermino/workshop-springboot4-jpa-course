package com.myprojects.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.coursespringboot.entities.User;


// nao precisa colocar @Repository porque herda de JpaRepository que já é registrado como um componente do Spring
public interface UserRepository extends JpaRepository<User, Long> {

}
