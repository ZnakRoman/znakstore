package by.znak.dao;

import by.znak.entities.RequestTicket;

public interface RequestTicketDao {
    RequestTicket create(RequestTicket requestTicket);
    RequestTicket update(RequestTicket requestTicket);
    RequestTicket read(Long id);
    void delete(RequestTicket requestTicket);
}
