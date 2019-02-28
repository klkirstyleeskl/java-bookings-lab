package com.example.BookingSystem.components;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.BookingRepository;
import com.example.BookingSystem.repositories.CourseRepository;
import com.example.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Helga", "Bermuda Town",100);
        customerRepository.save(customer1);


        Course course1 = new Course("Hula Dancing", "Brighton", 5, customer1);
        courseRepository.save(course1);


        Booking booking1 = new Booking("05-07-2019", customer1);
        bookingRepository.save(booking1);

    }

}
