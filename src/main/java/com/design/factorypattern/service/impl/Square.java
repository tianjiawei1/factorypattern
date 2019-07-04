package com.design.factorypattern.service.impl;

import com.design.factorypattern.service.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
