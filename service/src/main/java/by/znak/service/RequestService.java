package by.znak.service;

import by.znak.entities.Request;

public interface RequestService {
    Request create(Request request);
    Request update(Request request);
    Request read(Long id);
    void delete(Request request);
}
