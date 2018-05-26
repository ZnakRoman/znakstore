package by.znak.controller;

import by.znak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/profile")
    public String profile(){
        return "main";
    }

    @PostMapping("/profile")
    public String loginSuccess(){
        return "main";
    }

}
