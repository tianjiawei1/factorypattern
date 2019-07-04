package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
