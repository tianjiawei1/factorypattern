package com.design.abstractfactorypattern.service.impl;

import com.design.abstractfactorypattern.service.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
