package com.company.ninth_lesson.inheritance;

public class MainInheritance
{
	public static void main(String[] args)
	{
		Shape shape = new Shape(1);
		Shape rectangle = new Rectangle(1, 1, 1);
		Shape triangle = new Triangle(1, 1, 1, 1);

		rectangle.printSquare();
		triangle.printSquare();
	}
}
