package com.example.Service.A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceAController {
    @Autowired
    private ServiceAClient serviceAClient;

    @PostMapping("/send")
    public String sendDataToServiceB(@RequestBody String data) {
        return serviceAClient.callServiceB(data);
    }

}
