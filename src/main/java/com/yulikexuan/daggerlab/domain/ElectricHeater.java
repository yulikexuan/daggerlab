//: com.yulikexuan.daggerlab.domain.ElectricHeater.java


package com.yulikexuan.daggerlab.domain;


import javax.inject.Inject;


public class ElectricHeater implements IHeater {

    private boolean heating;

    @Inject
    public ElectricHeater() {
    }

    @Override
    public void on() {
        System.out.println("~ ~ ~ Turn on electric heater ~ ~ ~");
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        System.out.println("~ ~ ~ Stop heating ~ ~ ~");
        System.out.println("~ ~ ~ Turn off electric heater ~ ~ ~");
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return this.heating;
    }

} ///:~
