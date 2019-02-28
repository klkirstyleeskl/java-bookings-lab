package com.example.BookingSystem.repositories.CustomerRepository;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Course> getAllCoursesFromCustomer(Long customerId){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.customer", "customerAlias");
            cr.add(Restrictions.eq("customerAlias.id", customerId));


            results = cr.list();

        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        return results;

    }


}
