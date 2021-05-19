package com.eduardodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
