package com.company.ninth_lesson.abs;

public abstract class AbstractShape
{
	protected int square;

	public AbstractShape(int square)
	{
		this.square = square;
	}

	protected void printSquare()
	{
		System.out.println("Shape");
	}

	protected abstract int countPerimeter();
}
