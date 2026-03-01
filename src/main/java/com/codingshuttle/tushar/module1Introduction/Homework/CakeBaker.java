package com.codingshuttle.tushar.module1Introduction.Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker  {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(@Qualifier("chocolateSyrup") Syrup syrup,
                     @Qualifier("strawberryFrosting") Frosting frosting) {
        this.syrup = syrup;
        this.frosting = frosting;
    }

    public void bakeCake(){
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
    }

}
