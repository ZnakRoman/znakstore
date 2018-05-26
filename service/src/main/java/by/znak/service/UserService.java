package by.znak.service;

import by.znak.entities.User;

public interface UserService {
    User create(User user);
    User update(User user);
    User read(Long id);
    void delete(User user);
}
