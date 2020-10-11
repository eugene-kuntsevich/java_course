package com.company.eleven_lesson.fruit_task;

public class Banana extends Fruit
{
	public Banana(double pricePerKilo)
	{
		super("Banana", pricePerKilo);
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
		System.out.println("Bananas were made in Ecuador");
	}
}
