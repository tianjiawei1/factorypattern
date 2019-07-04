package com.design.factorypattern.service.impl;

import com.design.factorypattern.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
