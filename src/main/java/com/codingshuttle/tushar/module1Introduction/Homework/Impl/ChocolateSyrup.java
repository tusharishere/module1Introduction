package com.codingshuttle.tushar.module1Introduction.Homework.Impl;

import com.codingshuttle.tushar.module1Introduction.Homework.Syrup;
import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup...";
    }
}
