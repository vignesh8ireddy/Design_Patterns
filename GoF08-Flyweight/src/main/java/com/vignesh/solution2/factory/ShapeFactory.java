package com.vignesh.solution2.factory;

import com.vignesh.solution2.component.Circle;
import com.vignesh.solution2.component.Shape;
import com.vignesh.solution2.component.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory<T extends Shape> {
    private static Map<String, Shape> cacheMap = new HashMap<>();
    public static <T extends Shape> T getInstance(String shapeType, Class<T> clazz) throws Exception {
        T shape = null;
        if(!cacheMap.containsKey(shapeType)) {
            cacheMap.put(shapeType, (T) clazz.getDeclaredConstructors()[0].newInstance(null));
        }
        return (T) cacheMap.get(shapeType);
    }
}
