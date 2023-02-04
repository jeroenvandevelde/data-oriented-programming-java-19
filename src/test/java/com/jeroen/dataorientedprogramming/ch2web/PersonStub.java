package com.jeroen.dataorientedprogramming.ch2web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PersonStub {

    @GetMapping(value = "person", produces = "application/json")
    ResponseEntity<Object> getPerson(@RequestParam("name") String name);
}
