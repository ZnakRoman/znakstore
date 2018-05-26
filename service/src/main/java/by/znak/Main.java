package by.znak;

import by.znak.entities.User;
import by.znak.service.UserService;
import by.znak.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User("qeru@gmail.com", "vbnm", "Ivan", "Ivanoff");
        UserService userService = new UserServiceImpl();
        userService.delete(user);
    }
}
