package com.example.BookingSystem.repositories.CourseRepository;

import com.example.BookingSystem.models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {

    public List<Customer> getAllCustomersFromCourse(Long courseId);

}
