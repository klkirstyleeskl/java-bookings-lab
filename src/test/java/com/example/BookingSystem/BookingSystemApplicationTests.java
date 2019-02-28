package com.example.BookingSystem;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.repositories.CourseRepository.CourseRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesByRating(){
		List<Course> found = courseRepository.findCoursesByRating(5);
		assertEquals(1, found.size());
	}

}
