package org.example.spring.controller;

import org.example.spring.controller.dto.Message;
import org.example.spring.model.Test;
import org.example.spring.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class HelloController {
    @Autowired
    private TestRepo testRepo;

    @GetMapping("/hello")
    public ResponseEntity<Message> hello(@RequestParam(defaultValue = "мир") String name){
        Test test = new Test(name);
        testRepo.save(test);
        return new ResponseEntity<>(new Message("привет: " + name), HttpStatus.CREATED);
    }
}