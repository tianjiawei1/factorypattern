package com.design.abstractfactorypattern.factory;

import com.design.abstractfactorypattern.abstractclass.AbstractFactory;
import com.design.abstractfactorypattern.service.Color;
import com.design.abstractfactorypattern.service.Shape;
import com.design.abstractfactorypattern.service.impl.Circle;
import com.design.abstractfactorypattern.service.impl.Rectangle;
import com.design.abstractfactorypattern.service.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
