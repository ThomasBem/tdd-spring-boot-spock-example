package com.github.temperature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TemperatureService {

    @Value("${api-base-url:http://localhost:8089}")
    private String baseUrl;

    @Autowired
    private RestTemplate restTemplate;

    public Temperature getTemperature(String city) {
        String path = String.format("/temperature/%s", city);
        Temperature temperature = restTemplate.getForObject((baseUrl + path), Temperature.class);
        return temperature;
    }
}
