package com.akash.playground;

import com.akash.playground.service.BarKeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {

        SpringApplication.run(PlaygroundApplication.class, args);
    }

    @Autowired
    public void setBeerService(BarKeeperService barKeeperService){
        barKeeperService.logBeerName();
    }
}
