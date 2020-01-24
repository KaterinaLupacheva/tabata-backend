package io.ramonak.controller.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

public class HerokuNoSleep {

    private final RestTemplate restTemplate;

    public HerokuNoSleep(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Scheduled(fixedRate = 29000)
    public void herokuNoSleep() {
        restTemplate.getForObject("https://tabata-backend.herokuapp.com/exercises", Object.class);
    }
}
