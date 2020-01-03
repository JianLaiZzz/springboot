package com.example.springboot.designpattern.factory;

public abstract class AbstractFactory
{
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
