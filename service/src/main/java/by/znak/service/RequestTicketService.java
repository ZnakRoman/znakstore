package by.znak.service;

import by.znak.entities.RequestTicket;

public interface RequestTicketService {
    RequestTicket create(RequestTicket requestTicket);
    RequestTicket update(RequestTicket requestTicket);
    RequestTicket read(Long id);
    void delete(RequestTicket requestTicket);
}
