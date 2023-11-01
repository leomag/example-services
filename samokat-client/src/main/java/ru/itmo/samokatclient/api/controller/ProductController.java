package ru.itmo.samokatclient.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.samokatclient.api.rest.DeliveryApi;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/best")
public class ProductController {

    private final DeliveryApi deliveryApi;

    @Value("${eureka.instance.instance-id}")
    public String id;

    @GetMapping("/id")
    public String getId() {
        return id;
    }

//    @Value("${user.role}")
//    private String role;
//
//    @GetMapping(value = "/role", produces = MediaType.TEXT_PLAIN_VALUE)
//    public String getRole() {
//        return role;
//    }

    @GetMapping("/feign-products")
    ResponseEntity<List<?>> findAllFeign() {
        return deliveryApi.findAll();
    }

}
