package com.akash.playground.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Flensburger")
public class Flensburger implements Beer{

    @Override
    public String getName() {
        return "Flensburger";
    }
}
