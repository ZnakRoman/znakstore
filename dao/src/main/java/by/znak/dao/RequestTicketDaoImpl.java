package by.znak.dao;

import by.znak.HibernateUtil;
import by.znak.entities.RequestTicket;
import org.hibernate.Session;

public class RequestTicketDaoImpl implements RequestTicketDao {
    public RequestTicket create(RequestTicket requestTicket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(requestTicket);
        session.getTransaction().commit();
        return requestTicket;
    }

    public RequestTicket update(RequestTicket requestTicket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(requestTicket);
        session.getTransaction().commit();
        return requestTicket;
    }

    public RequestTicket read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        RequestTicket requestTicket = (RequestTicket) session.get(RequestTicket.class, id);
        session.getTransaction().commit();
        return requestTicket;
    }

    public void delete(RequestTicket requestTicket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(requestTicket);
        session.getTransaction().commit();

    }
}
