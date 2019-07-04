package com.design.factorypattern.service.impl;

import com.design.factorypattern.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
