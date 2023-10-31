package ru.itmo.samokatclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBestController {

    @Value("${eureka.instance.instance-id}")
    public String id;

    @GetMapping("/best")
    public String getBest() {
        return id;
    }
}
