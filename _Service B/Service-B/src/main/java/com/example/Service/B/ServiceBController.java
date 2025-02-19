package com.example.Service.B;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceBController {

    @PostMapping("/process")
    public String processData(@RequestBody String data) {
        // Process the data (e.g., log it or perform some operation)
        System.out.println("Service B received: " + data);
        return "Processed: " + data;
    }
}
