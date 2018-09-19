//: com.yulikexuan.daggerlab.domain.CoffeeMaker.java


package com.yulikexuan.daggerlab.domain;


import dagger.Lazy;

import javax.inject.Inject;


public class CoffeeMaker implements ICoffeeMaker {

    private final Lazy<IHeater> heater;
    private final IPump pump;

    @Inject
    public CoffeeMaker(Lazy<IHeater> heater, IPump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    @Override
    public void brew() {
        this.heater.get().on();
        this.pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        this.heater.get().off();
    }

} ///:~
