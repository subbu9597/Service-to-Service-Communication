package com.example.Service.A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceAClient {
    @Autowired
    private RestTemplate restTemplate;

    public String callServiceB(String data) {
        String url = "http://localhost:8081/api/process";
        return restTemplate.postForObject(url, data, String.class);
    }

}
