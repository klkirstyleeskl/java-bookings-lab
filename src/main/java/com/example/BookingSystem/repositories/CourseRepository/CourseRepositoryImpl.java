package com.example.BookingSystem.repositories.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CourseRepositoryImpl implements  CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;


}
