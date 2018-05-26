package by.znak.service;

import by.znak.dao.RequestTicketDao;
import by.znak.dao.RequestTicketDaoImpl;
import by.znak.entities.RequestTicket;

public class RequestTicketServiceImpl implements RequestTicketDao {
    public RequestTicket create(RequestTicket requestTicket) {
        RequestTicketDao requestDao = new RequestTicketDaoImpl();
        return requestDao.create(requestTicket);
    }

    public RequestTicket update(RequestTicket requestTicket) {
        RequestTicketDao requestDao = new RequestTicketDaoImpl();
        return requestDao.update(requestTicket);
    }

    public RequestTicket read(Long id) {
        RequestTicketDao requestDao = new RequestTicketDaoImpl();
        return requestDao.read(id);
    }

    public void delete(RequestTicket requestTicket) {
        RequestTicketDao requestDao = new RequestTicketDaoImpl();
        requestDao.create(requestTicket);
    }
}
