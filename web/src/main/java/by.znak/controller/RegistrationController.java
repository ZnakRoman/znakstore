package by.znak.controller;

import by.znak.entities.User;
import by.znak.service.UserService;
import by.znak.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @ModelAttribute("user")
    public User user(){
        return new User();
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(User user){
        UserServiceImpl userService = new UserServiceImpl();
        userService.create(user);
        return "registration";
    }
}
