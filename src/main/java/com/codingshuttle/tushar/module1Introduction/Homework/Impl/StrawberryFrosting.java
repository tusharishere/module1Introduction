package com.codingshuttle.tushar.module1Introduction.Homework.Impl;

import com.codingshuttle.tushar.module1Introduction.Homework.Frosting;
import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        return "Straberry Frosting..";
    }
}
