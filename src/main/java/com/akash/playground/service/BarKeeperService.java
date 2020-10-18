package com.akash.playground.service;

import com.akash.playground.dependencyInjection.Beer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarKeeperService {
    Logger LOG = LoggerFactory.getLogger(BarKeeperService.class);

    private List<Beer> beer;

    public BarKeeperService(List<Beer> beer) {
        this.beer = beer;
    }

    public void logBeerName(){
        beer.stream().map(Beer::getName).forEach(LOG::info);
    }
}
