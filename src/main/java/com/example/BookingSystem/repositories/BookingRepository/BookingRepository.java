package com.example.BookingSystem.repositories.BookingRepository;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    public List<Booking> findBookingsByDate(String date);

}
