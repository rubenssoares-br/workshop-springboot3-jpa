package com.javaproject.course.config;

import com.javaproject.course.entities.User;
import com.javaproject.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Joaozin", "joao@gmail.com","9888888","1234567");
        User u2 = new User(null, "Felipe", "felipe@gmail.com","9388888", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
