package com.jeroen.dataorientedprogramming.ch2web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PersonClientIntegrationTest {

    @Autowired
    PersonClient personClient;

    @Autowired
    PersonStub personStub;

    @Test
    void getAValidPerson() {
        when(personStub.getPerson("Bart"))
                .thenReturn(ResponseEntity.notFound().build());

        WebResult<Person> bart = personClient.getPerson("Bart");

        switch (bart) {
            case WebResult.Result<Person> value -> System.out.println(value);
            case WebResult.Error<Person> ignored -> System.out.println("error");
            case WebResult.NotFound<Person> ignored -> System.out.println("notFound");
        }
    }
}
