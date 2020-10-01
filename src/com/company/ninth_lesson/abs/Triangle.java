package com.company.ninth_lesson.abs;

public class Triangle extends AbstractShape
{
	private int i1; //длина стороны
	private int i2;
	private int i3;

	public Triangle(int square, int i1, int i2, int i3)
	{
		super(square);
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
	}

	@Override
	protected int countPerimeter()
	{
		return i1 + i2 + i3;
	}
}
