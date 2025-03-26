package com.vignesh.problem.component;

public class Circle implements Shape {
    private String label;
    public Circle() {
        System.out.println("Circle()");
        this.label = "Circle";
    }
    @Override
    public void draw(int radius, String color, String lineStyle) {
        System.out.println("Drawing Circle with radius: "+radius+", color: "+color+"and line style: "+lineStyle);
    }
}
