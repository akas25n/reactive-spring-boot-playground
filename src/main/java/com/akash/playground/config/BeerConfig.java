package com.akash.playground.config;

import com.akash.playground.dependencyInjection.Beer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@PropertySource("classpath:/beers.properties")
public class BeerConfig {

    @Bean
    @Qualifier("Becks")
    public Beer getBecks(){

        return new Beer() {

            @Override
            public String getName() {
                return "Becks";
            }
        };
    }

    @Bean
    public List<Beer> getBeerNameFromProperty(@Value("${beer.names}") List<String> beerNames){
        return beerNames.stream().map(bn -> new Beer() {
            @Override
            public String getName() {
                return bn;
            }
        }).collect(Collectors.toList());
    }
}
