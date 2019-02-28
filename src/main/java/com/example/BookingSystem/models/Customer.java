package com.example.BookingSystem.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_town")
    private String customerTown;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public Customer(String customerName, String customerTown, int age){
        this.customerName = customerName;
        this.customerTown = customerTown;
        this.age = age;
        this.bookings = new ArrayList<>();
    }

    public Customer(){

    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTown() {
        return customerTown;
    }

    public void setCustomerTown(String customerTown) {
        this.customerTown = customerTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
