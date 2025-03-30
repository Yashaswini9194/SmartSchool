package com.java.smart.school.Repository;

import com.java.smart.school.Domain.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository {

    private final SessionFactory sessionFactory;

    public DepartmentRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public long getNumberOfDepartments(){
        Session session = sessionFactory.openSession();
        String hql = "SELECT count(id) FROM Department";
        Query<Long> query = session.createQuery(hql, Long.class);
        return query.getSingleResult();
    }

    public long getNumberOfTeachers(){
        Session session = sessionFactory.openSession();
        String hql = "SELECT sum(noOfTeachers) FROM Department";
        Query<Long> query = session.createQuery(hql, Long.class);
        return query.getSingleResult();
    }

    public long getNumberOfStudents(){
        Session session = sessionFactory.openSession();
        String hql = "SELECT sum(noOfStudents) FROM Department";
        Query<Long> query = session.createQuery(hql, Long.class);
        return query.getSingleResult();
    }

    public List<Department> getAllDepartments(){
        Session session = sessionFactory.openSession();
        String hql = "FROM Department";
        Query<Department> query = session.createQuery(hql, Department.class);
        List<Department> departments = query.getResultList();
        return departments;
    }

    public Department getDepartmentByAbbreviation (String abbreviation) {
        Session session = sessionFactory.openSession();
        String hql = "FROM Department WHERE abbreviation = :abbreviation";
        Query<Department> query = session.createQuery(hql, Department.class);
        query.setParameter("abbreviation", abbreviation);
        return query.getSingleResult();
    }

    public void createDepartment(Department department){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(department);
        transaction.commit();
    }

    public void deleteDepartment(String abbreviation){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "DELETE from Department WHERE abbreviation = :abbreviation";
        Query query = session.createQuery(hql);
        query.setParameter("abbreviation", abbreviation);
        query.executeUpdate();
        transaction.commit();
    }
}
