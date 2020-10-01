package com.company.ninth_lesson.abs;

public class Rectangle extends AbstractShape
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

	@Override
	protected int countPerimeter()
	{
		return height * 2 + width * 2;
	}
}
