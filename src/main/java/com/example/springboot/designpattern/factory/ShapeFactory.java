package com.example.springboot.designpattern.factory;

public class ShapeFactory extends AbstractFactory
{
	@Override
	public Color getColor(String shapeType)
	{

		return null;
	}

	@Override
	public Shape getShape(String shapeType)
	{
		if (shapeType == null)
		{
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE"))
		{
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
		{
			return new Rectangle();
		}
		else if (shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}
}