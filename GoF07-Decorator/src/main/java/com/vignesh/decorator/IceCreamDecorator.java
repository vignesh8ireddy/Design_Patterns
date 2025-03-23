package com.vignesh.decorator;

import com.vignesh.component.IceCream;

public abstract class IceCreamDecorator implements IceCream {
    IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void prepare() {
        iceCream.prepare();
    }
}