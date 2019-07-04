package com.design.abstractfactorypattern.producer;

import com.design.abstractfactorypattern.abstractclass.AbstractFactory;
import com.design.abstractfactorypattern.factory.ColorFactory;
import com.design.abstractfactorypattern.factory.ShapeFactory;

public class FactoryProducer {
     //创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
