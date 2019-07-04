package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
