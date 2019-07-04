package com.design.abstractfactorypattern.abstractclass;

import com.design.abstractfactorypattern.service.Color;
import com.design.abstractfactorypattern.service.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String color);
}
