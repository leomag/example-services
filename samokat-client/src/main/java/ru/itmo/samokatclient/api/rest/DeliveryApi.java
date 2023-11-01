package ru.itmo.samokatclient.api.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.itmo.samokatclient.api.dto.ProductDto;

import java.util.List;

@FeignClient(name = "delivery-api", url = "127.0.0.1:80/api/v1/delivery")
public interface DeliveryApi {
    @PostMapping("/product/new")
    ResponseEntity<?> createProduct(@RequestBody ProductDto productDto);
    @GetMapping("/products")
    ResponseEntity<List<?>> findAll();
}