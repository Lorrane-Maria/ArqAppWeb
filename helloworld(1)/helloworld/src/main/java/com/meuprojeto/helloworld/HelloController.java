package com.meuprojeto.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/test")
    public String helloWorld() {
        return "Hello, World!<br>Bem vindo ao primeiro projeto Spring Boot desenvolvido por Lorrane!";
    }
}
