package com.example.springboot_rest_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_rest_test.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
