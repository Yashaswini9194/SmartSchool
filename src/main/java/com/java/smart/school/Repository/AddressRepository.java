package com.java.smart.school.Repository;

import com.java.smart.school.Domain.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository {

    private final SessionFactory sessionFactory;

    public AddressRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Address getAddressById(int addressId){
        Session session = sessionFactory.openSession();
        String hql = "FROM Address WHERE addressId = :addressId";
        Query<Address> query = session.createQuery(hql, Address.class);
        query.setParameter("addressId", addressId);
        return query.getSingleResult();
    }
}
