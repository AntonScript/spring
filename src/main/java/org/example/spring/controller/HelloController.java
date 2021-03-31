package org.example.spring.controller;

import org.example.spring.controller.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Message> hello(@RequestParam(defaultValue = "мир") String name){
        return new ResponseEntity<>(new Message("привет: " + name), HttpStatus.ACCEPTED);
    }

}