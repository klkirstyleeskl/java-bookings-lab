package com.example.BookingSystem.repositories.CustomerRepository;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    public List<Course> getAllCoursesFromCustomer(Long customerId);
}
