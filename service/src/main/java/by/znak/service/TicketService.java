package by.znak.service;

import by.znak.entities.Ticket;

public interface TicketService {
    Ticket create(Ticket user);
    Ticket update(Ticket user);
    Ticket read(Long id);
    void delete(Ticket user);
}
