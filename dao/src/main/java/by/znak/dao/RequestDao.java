package by.znak.dao;

import by.znak.entities.Request;

public interface RequestDao {
    Request create(Request request);
    Request update(Request request);
    Request read(Long id);
    void delete(Request request);
}
