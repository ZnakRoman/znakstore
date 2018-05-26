package by.znak.dao;

import by.znak.HibernateUtil;
import by.znak.entities.Request;
import org.hibernate.Session;

public class RequestDaoImpl implements RequestDao {

    public Request create(Request request) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(request);
        session.getTransaction().commit();
        return request;
    }

    public Request update(Request request) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(request);
        session.getTransaction().commit();
        return request;
    }

    public Request read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Request request = (Request) session.get(Request.class, id);
        session.getTransaction().commit();
        return request;
    }

    public void delete(Request request) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(request);
        session.getTransaction().commit();

    }
}
