//: com.yulikexuan.daggerlab.DripCoffeeModule.java


package com.yulikexuan.daggerlab;


import com.yulikexuan.daggerlab.domain.CoffeeMaker;
import com.yulikexuan.daggerlab.domain.ElectricHeater;
import com.yulikexuan.daggerlab.domain.ICoffeeMaker;
import com.yulikexuan.daggerlab.domain.IHeater;
import com.yulikexuan.daggerlab.domain.IPump;
import com.yulikexuan.daggerlab.domain.Thermosiphon;
import com.yulikexuan.daggerlab.domain.WaterHeater;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;


@Module
public class DripCoffeeModule {

    @Named("electric")
    @Singleton
    @Provides
    public static IHeater provideElectricHeater() {
        return new ElectricHeater();
    }

    @Named("water")
    @Singleton
    @Provides
    public static IHeater provideWaterHeater() {
        return new WaterHeater();
    }

    @Provides
    public static IPump providePump(Thermosiphon pump) {
        return pump;
    }

    @Provides
    public static ICoffeeMaker provide(@Named("water") Lazy<IHeater> heater, IPump pump) {
        return new CoffeeMaker(heater, pump);
    }

} ///:~
