package by.znak.dao;

import by.znak.HibernateUtil;
import by.znak.entities.Ticket;
import org.hibernate.Session;

public class TicketDaoImpl implements TicketDao {
    public Ticket create(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(ticket);
        session.getTransaction().commit();
        return ticket;
    }

    public Ticket update(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(ticket);
        session.getTransaction().commit();
        return ticket;
    }

    public Ticket read(Long id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Ticket ticket = (Ticket) session.get(Ticket.class, id);
        session.getTransaction().commit();
        return ticket;
    }

    public void delete(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(ticket);
        session.getTransaction().commit();
    }
}
