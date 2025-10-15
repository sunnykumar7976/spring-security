package in.sunny.springsecuritydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('User')")
    public String userHello(){
        return "Hello User";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('Admin')")
    public String adminHello(){
        return "Hello Sunny";
    }

}
