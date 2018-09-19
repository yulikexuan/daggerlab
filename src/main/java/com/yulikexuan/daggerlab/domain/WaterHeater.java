//: com.yulikexuan.daggerlab.domain.WaterHeater.java


package com.yulikexuan.daggerlab.domain;


import javax.inject.Inject;


public class WaterHeater implements IHeater {

    private boolean heating;

    @Inject
    public WaterHeater() {
    }

    @Override
    public void on() {
        System.out.println("~ ~ ~ Add hot water ~ ~ ~");
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        System.out.println("~ ~ ~ Stop heating ~ ~ ~");
        System.out.println("~ ~ ~ Releasing water ~ ~ ~");
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return this.heating;
    }

} ///:~
