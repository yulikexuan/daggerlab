//: com.yulikexuan.daggerlab.DaggerlabApplication.java


package com.yulikexuan.daggerlab;


public class DaggerlabApplication {

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeShop.create();
        coffeeShop.coffeeMaker().brew();
    }

}///:~