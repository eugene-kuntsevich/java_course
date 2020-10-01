package com.company.ninth_lesson.abs;

public class MainAbstract
{
	public static void main(String[] args)
	{
		AbstractShape rectangle = new Rectangle(1, 4, 7);
		int i = rectangle.countPerimeter();
		System.out.println(i);

		AbstractShape triangle = new Triangle(1, 4, 7, 8);
		int i2 = triangle.countPerimeter();
		System.out.println(i2);
	}
}
