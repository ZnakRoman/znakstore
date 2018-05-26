package by.znak.service;

import by.znak.dao.UserDao;
import by.znak.dao.UserDaoImpl;
import by.znak.entities.User;

public class UserServiceImpl implements UserService {

    public User create(User user) {
        UserDao userDao = new UserDaoImpl();
        return userDao.create(user);
    }

    public User update(User user) {
        UserDao userDao = new UserDaoImpl();
        return userDao.update(user);
    }

    public User read(Long id) {
        UserDao userDao = new UserDaoImpl();
        return userDao.read(id);
    }

    public void delete(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.delete(user);
    }
}
