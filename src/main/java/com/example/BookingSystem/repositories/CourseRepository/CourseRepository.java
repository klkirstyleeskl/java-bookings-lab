package com.example.BookingSystem.repositories.CourseRepository;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> findCoursesByRating(int rating);
    public List<Customer> getAllCustomersFromCourse(Long courseId);


}
