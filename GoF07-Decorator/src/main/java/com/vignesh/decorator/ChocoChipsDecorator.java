package com.vignesh.decorator;

import com.vignesh.component.IceCream;

public class ChocoChipsDecorator extends IceCreamDecorator {

    public ChocoChipsDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void prepare() {
        super.prepare();
        addChocoChips();
    }

    public void addChocoChips() {
        System.out.println("Add Choco Chips");
    }
}
