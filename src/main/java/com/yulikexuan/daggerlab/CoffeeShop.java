//: com.yulikexuan.daggerlab.CoffeeShop.java


package com.yulikexuan.daggerlab;


import com.yulikexuan.daggerlab.domain.ICoffeeMaker;
import dagger.Component;

import javax.inject.Singleton;


@Singleton
@Component(modules = DripCoffeeModule.class)
public interface CoffeeShop {

    ICoffeeMaker coffeeMaker();

}///:~