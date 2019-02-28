package com.example.BookingSystem;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByRating(5);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetCustomerByCourse(){
		List<Customer> found = courseRepository.getAllCustomersFromCourse(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetBookingByDate(){
		List<Booking> found = bookingRepository.findBookingsByDate("05-07-2019");
		assertEquals(2, found.size());
	}

	@Test
	public void canGetCourseByCustomer(){
		List<Course> found = customerRepository.getAllCoursesFromCustomer(1L);
		assertEquals(2, found.size());
	}

}
