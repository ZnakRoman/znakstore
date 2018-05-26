package by.znak.dao;

import by.znak.entities.Ticket;

public interface TicketDao {
    Ticket create(Ticket ticket);
    Ticket update(Ticket ticket);
    Ticket read(Long id);
    void delete(Ticket ticket);
}
