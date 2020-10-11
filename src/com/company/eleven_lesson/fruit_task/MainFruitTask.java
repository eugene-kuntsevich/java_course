package com.company.eleven_lesson.fruit_task;

public class MainFruitTask
{
	public static void main(String[] args)
	{
		Apple apple = new Apple(2);
		apple.printManufacturerInfo();
		apple.sellFruit(3);
		Fruit.printBankAccountInfo();

		Banana banana = new Banana(10);
		banana.printManufacturerInfo();
		banana.sellFruit(5);
		banana.sellFruit(7);

		Fruit.printBankAccountInfo();
	}
}
