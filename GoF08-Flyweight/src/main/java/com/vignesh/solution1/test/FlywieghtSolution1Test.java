package com.vignesh.solution1.test;

import com.vignesh.solution1.component.Circle;
import com.vignesh.solution1.component.Shape;
import com.vignesh.solution1.component.Square;
import com.vignesh.solution1.factory.ShapeFactory;

//Here only one object of each shape is created and reused every time for drawing
public class FlywieghtSolution1Test {
    public static void main(String[] args) {

        /*
        // The below code works fine!
        System.out.println("===============Drawing Circles===============");
        for(int i=1;i<=5;i++) {
            Shape circle = ShapeFactory.getInstance("circle");
            circle.draw(i+10,"red","bold");
        }
        System.out.println("===============Drawing Squares===============");
        for(int i=1;i<=5;i++) {
            Shape square = ShapeFactory.getInstance("square");;
            square.draw(i+10,"blue","dashed");
        */

        // The below code needs type casting
        System.out.println("===============Drawing Circles===============");
        for(int i=1;i<=5;i++) {
            Circle circle = (Circle) ShapeFactory.getInstance("circle");
            circle.draw(i+10,"red","bold");
        }
        System.out.println("===============Drawing Squares===============");
        for(int i=1;i<=5;i++) {
            Square square = (Square) ShapeFactory.getInstance("square");;
            square.draw(i+10,"blue","dashed");
        }
    }
}

/*
Output::

===============Drawing Circles===============
Circle()
Drawing Circle with radius: 11, color: redand line style: bold
Drawing Circle with radius: 12, color: redand line style: bold
Drawing Circle with radius: 13, color: redand line style: bold
Drawing Circle with radius: 14, color: redand line style: bold
Drawing Circle with radius: 15, color: redand line style: bold
===============Drawing Squares===============
Square()
Drawing Square with side length: 11, color: blueand line style: dashed
Drawing Square with side length: 12, color: blueand line style: dashed
Drawing Square with side length: 13, color: blueand line style: dashed
Drawing Square with side length: 14, color: blueand line style: dashed
Drawing Square with side length: 15, color: blueand line style: dashed
 */