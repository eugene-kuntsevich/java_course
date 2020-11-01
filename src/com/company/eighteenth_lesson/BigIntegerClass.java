package com.company.eighteenth_lesson;

import java.math.BigInteger;

public class BigIntegerClass
{
	public static void main(String[] args)
	{
		BigInteger bigInteger = new BigInteger("100");
		BigInteger result = bigInteger.divide(new BigInteger("3"));

		System.out.println(result);

		BigInteger multiply = result.multiply(new BigInteger("3"));
		System.out.println(multiply);
	}
}
