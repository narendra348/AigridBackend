package com.example.SBRender1;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins ="https://aigridfrontend.onrender.com")
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot 🚀 ";
    }
}
