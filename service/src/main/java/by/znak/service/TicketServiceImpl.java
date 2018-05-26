package by.znak.service;

import by.znak.dao.TicketDao;
import by.znak.dao.TicketDaoImpl;
import by.znak.entities.Ticket;

public class TicketServiceImpl {
    public Ticket create(Ticket ticket) {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.create(ticket);
    }

    public Ticket update(Ticket ticket) {

        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.update(ticket);
    }

    public Ticket read(Long id) {
        TicketDao ticketDao = new TicketDaoImpl();
        return ticketDao.read(id);
    }

    public void delete(Ticket ticket) {
        TicketDao ticketDao = new TicketDaoImpl();
        ticketDao.delete(ticket);
    }
}
