package com.company.eighteenth_lesson;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass
{
	public static void main(String[] args)
	{
		BigDecimal bigDecimal = new BigDecimal("100");
		BigDecimal result = bigDecimal.divide(new BigDecimal("3"), 3, RoundingMode.DOWN);

		System.out.println(result);

		BigDecimal multiply = result.multiply(new BigDecimal("3"));
		System.out.println(multiply);

	}
}
