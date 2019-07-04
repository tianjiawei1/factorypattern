package com.design.factorypattern.factory;

import com.design.factorypattern.service.impl.Circle;
import com.design.factorypattern.service.impl.Rectangle;
import com.design.factorypattern.service.Shape;
import com.design.factorypattern.service.impl.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
}
