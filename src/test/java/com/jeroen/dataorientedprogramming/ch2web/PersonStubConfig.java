package com.jeroen.dataorientedprogramming.ch2web;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonStubConfig {
    @Bean
    public PersonStub personStub() {
        return Mockito.mock(PersonStub.class);
    }
}
