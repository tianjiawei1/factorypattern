package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
