package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    public HelloController() {
        System.out.println("CONTROLLER LOADED");
    }

    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
