package com.company.eleven_lesson.fruit_task;

public abstract class Fruit
{
	protected String fruitName;
	protected double pricePerKilo;//price for one kilogrammes
	private static double bankAccount = 0;

	public Fruit(String name, double pricePerKilo)
	{
		this.fruitName = name;
		this.pricePerKilo = pricePerKilo;
	}

	protected abstract void printManufacturerInfo();

	protected abstract void sellFruit(int weight);

	public static void addEarnedMoneyToBankAccount(double amountOfMoneyEarned)
	{
		bankAccount = bankAccount + amountOfMoneyEarned;
	}

	public static void printBankAccountInfo()
	{
		System.out.println("Amount of money on bank account = $" + bankAccount);
	}

	protected void printDealInfo(int weight, double earned, String name)
	{
		System.out.println("Sold " + weight + " kilogrammes of " + name +"s, $" + earned + " earned!");
	}

}
