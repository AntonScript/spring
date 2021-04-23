package org.example.spring.controller;

import org.example.spring.controller.dto.Message;
import org.example.spring.controller.dto.TestValidator;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class TestValid {

    @PostMapping("/valid")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Message testValidator(
            @Valid @RequestBody  TestValidator testValidator,
            Errors errors
    ){
        if(errors.hasErrors()){
            throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return new Message("13");
    }
}
