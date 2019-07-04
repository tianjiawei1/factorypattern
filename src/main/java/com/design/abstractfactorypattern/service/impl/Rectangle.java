package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
