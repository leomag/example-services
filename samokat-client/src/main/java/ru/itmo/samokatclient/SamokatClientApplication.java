package ru.itmo.samokatclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.itmo.samokatclient.api.rest.DeliveryApi;

@SpringBootApplication
@EnableFeignClients(clients = {DeliveryApi.class})
public class SamokatClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamokatClientApplication.class, args);
    }

}
