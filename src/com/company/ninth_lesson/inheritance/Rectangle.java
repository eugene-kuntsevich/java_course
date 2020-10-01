package com.company.ninth_lesson.inheritance;

public class Rectangle extends Shape
{
	public int height;
	public int width;

	public Rectangle(int square, int height, int width)
	{
		super(square);
		this.height = height;
		this.width = width;
	}

	@Override
	protected void printSquare()
	{
		System.out.println("Rectangle");
	}
}
