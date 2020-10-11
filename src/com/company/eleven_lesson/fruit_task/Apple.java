package com.company.eleven_lesson.fruit_task;

public class Apple extends Fruit
{
	public Apple(double pricePerKilo)
	{
		super("Apple", pricePerKilo);
	}

	@Override
	protected void sellFruit(int weight)
	{
		double earned = weight * pricePerKilo;
		addEarnedMoneyToBankAccount(earned);
		printDealInfo(weight, earned, fruitName);
	}

	@Override
	public void printManufacturerInfo()
	{
		System.out.println("Apples were made in Belarus");
	}
}
