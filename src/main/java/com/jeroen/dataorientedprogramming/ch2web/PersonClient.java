package com.jeroen.dataorientedprogramming.ch2web;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class PersonClient {
    private final RestTemplate restTemplate;

    public PersonClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WebResult<Person> getPerson(String name) {
        Person person = null;
        try {
            person = restTemplate.getForObject("http://localhost:8080/person?name={name}", Person.class, Map.of("name", name));
        } catch (RestClientException e) {
            return new WebResult.NotFound<Person>();
        }
        return new WebResult.Result(person);
    }
}
