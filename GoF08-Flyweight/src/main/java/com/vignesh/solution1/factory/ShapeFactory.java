package com.vignesh.solution1.factory;

import com.vignesh.solution1.component.Circle;
import com.vignesh.solution1.component.Shape;
import com.vignesh.solution1.component.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> cacheMap = new HashMap<>();
    public static Shape getInstance(String shapeType) {
        Shape shape = null;
        if(!cacheMap.containsKey(shapeType)) {
            if(shapeType.equalsIgnoreCase("circle")) {
                shape = new Circle();
            }
            else if(shapeType.equalsIgnoreCase("square")) {
                shape = new Square();
            }
            else throw new IllegalArgumentException("Invalid Shape");
            cacheMap.put(shapeType,shape);
        }
        return cacheMap.get(shapeType);
    }
}
