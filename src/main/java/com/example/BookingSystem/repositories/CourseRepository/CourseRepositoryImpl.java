package com.example.BookingSystem.repositories.CourseRepository;

import com.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Customer> getAllCustomersFromCourse(Long courseId){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "courseAlias");
            cr.add(Restrictions.eq("courseAlias.id", courseId));


            results = cr.list();

        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return results;

    }


}
