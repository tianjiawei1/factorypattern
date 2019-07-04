package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
