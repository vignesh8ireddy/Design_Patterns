package com.vignesh.problem.test;

import com.vignesh.problem.component.Circle;
import com.vignesh.problem.component.Shape;
import com.vignesh.problem.component.Square;

public class FlywieghtProblemTest {
    public static void main(String[] args) {
        System.out.println("===============Drawing Circles===============");
        for(int i=1;i<=5;i++) {
            Shape circle = new Circle();
            circle.draw(i+10,"red","bold");
        }
        System.out.println("===============Drawing Squares===============");
        for(int i=1;i<=5;i++) {
            Shape square = new Square();
            square.draw(i+10,"blue","dashed");
        }
    }
}

/*
The problem with the above code is that, for every new shape it creates a new object which is a bad practice because of
its poor utilization of CPU time and memory.

Output::

===============Drawing Circles===============
Circle()
Drawing Circle with radius: 11, color: redand line style: bold
Circle()
Drawing Circle with radius: 12, color: redand line style: bold
Circle()
Drawing Circle with radius: 13, color: redand line style: bold
Circle()
Drawing Circle with radius: 14, color: redand line style: bold
Circle()
Drawing Circle with radius: 15, color: redand line style: bold
===============Drawing Squares===============
Square()
Drawing Square with side length: 11, color: blueand line style: dashed
Square()
Drawing Square with side length: 12, color: blueand line style: dashed
Square()
Drawing Square with side length: 13, color: blueand line style: dashed
Square()
Drawing Square with side length: 14, color: blueand line style: dashed
Square()
Drawing Square with side length: 15, color: blueand line style: dashed
 */