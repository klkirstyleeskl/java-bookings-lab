package com.example.BookingSystem.repositories.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;


}
