package com.vignesh.test;

import com.vignesh.component.ChocolateIceCream;
import com.vignesh.component.IceCream;
import com.vignesh.component.VanillaIceCream;
import com.vignesh.decorator.ChocoChipsDecorator;
import com.vignesh.decorator.HoneyDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        System.out.println("================Making plain Chocolate Ice Cream================");
        IceCream chocolateIceCream = new ChocolateIceCream();
        chocolateIceCream.prepare();
        System.out.println("================Making Vanilla Ice Cream with Choco Chips================");
        IceCream vanillaIceCream = new VanillaIceCream();
        IceCream vanillaChocoChipsIceCream = new ChocoChipsDecorator(vanillaIceCream);
        vanillaChocoChipsIceCream.prepare();
        System.out.println("================Making Vanilla Ice Cream with Choco Chips and Honey================");
        IceCream vanillaIceCream2 = new VanillaIceCream();
        IceCream vanillaChocoChips = new ChocoChipsDecorator(vanillaIceCream2);
        IceCream vanillaChocoChipsHoney = new HoneyDecorator(vanillaChocoChips);
        vanillaChocoChipsHoney.prepare();
    }
}

/*
Output::

================Making plain Chocolate Ice Cream================
ChocolateIceCream.prepare()
================Making Vanilla Ice Cream with Choco Chips================
VanillaIceCream.prepare()
Add Choco Chips
================Making Vanilla Ice Cream with Choco Chips and Honey================
VanillaIceCream.prepare()
Add Choco Chips
Add Honey
 */