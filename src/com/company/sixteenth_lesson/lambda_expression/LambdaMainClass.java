package com.company.sixteenth_lesson.lambda_expression;

public class LambdaMainClass
{
	public static void main(String[] args)
	{
		/*Subtraction subtraction = new Subtraction()
		{
			@Override
			public int subtractionMethod(int i1, int i2)
			{
				int i = i1 - i2;
				System.out.println("Subtraction result = " + i);
				return i;
			}
		};*/

		Subtraction subtraction = (i1, i2) -> {
			int i = i1 - i2;
			System.out.println("Subtraction result = " + i);
			return i;
		};

		int result = subtraction.subtractionMethod(10, 2);

		System.out.println("Method finished, result * 2 = " + result * 2);
	}
}
