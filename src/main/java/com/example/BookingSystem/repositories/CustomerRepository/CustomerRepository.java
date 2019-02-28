package com.example.BookingSystem.repositories.CustomerRepository;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public List<Course> getAllCoursesFromCustomer(Long customerId);
}
