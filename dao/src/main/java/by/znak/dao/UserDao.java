package by.znak.dao;

import by.znak.entities.User;

public interface UserDao {
    User create(User user);
    User update(User user);
    User read(Long id);
    void delete(User user);
}
