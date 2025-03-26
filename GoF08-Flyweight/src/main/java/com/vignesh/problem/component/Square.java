package com.vignesh.problem.component;

public class Square implements Shape {
    private String label;
    public Square() {
        System.out.println("Square()");
        this.label = "Square";
    }
    @Override
    public void draw(int side, String color, String lineStyle) {
        System.out.println("Drawing Square with side length: "+side+", color: "+color+"and line style: "+lineStyle);
    }
}
