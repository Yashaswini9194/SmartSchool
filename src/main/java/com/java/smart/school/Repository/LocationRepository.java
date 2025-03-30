package com.java.smart.school.Repository;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LocationRepository {

    private final SessionFactory sessionFactory;

    public LocationRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
