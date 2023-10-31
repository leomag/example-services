package ru.itmo.deliveryclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @Value("${eureka.instance.instance-id}")
    public String id;
    @GetMapping("/product")
    public String getName() {
        return id;
    }
}
