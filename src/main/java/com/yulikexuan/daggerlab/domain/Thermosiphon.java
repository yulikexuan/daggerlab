//: com.yulikexuan.daggerlab.domain.Thermosiphon.java


package com.yulikexuan.daggerlab.domain;


import javax.inject.Inject;
import javax.inject.Named;


public class Thermosiphon implements IPump {

    private final IHeater heater;

    @Inject
    public Thermosiphon(@Named("water") IHeater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (this.heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }

} ///:~
