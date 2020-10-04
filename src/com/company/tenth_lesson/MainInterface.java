package com.company.tenth_lesson;

public class MainInterface
{
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.walk();
		dog.run();

		cat.makeNoise();
		dog.makeNoise();

		System.out.println("--------------------------------------------");

		Noisable noisableCat = new Cat();
		noisableCat.makeNoise();

		Eatable eatableDog = new Dog();
		eatableDog.eat();
		eatableDog.drink();
	}
}
