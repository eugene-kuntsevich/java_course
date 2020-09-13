package com.company.fifth_lesson;

/**
 * Метод 1 использует метод 2 и 3.
 * Метод 2 использует метод 4.
 * Метод 3 использует метод 5.
 * Метод 4 и 5 использует метод 6.
 *
 * Можно добавить в каждый метод System.out.println() чтобы понять порядок вызова методов ЛИБО поставить брекпоинт
 * на 16 строку и нажимать F7
 */
public class Task
{
	public static void main(String[] args)
	{
		int result = first();
		System.out.println(result);
	}

	private static int first()
	{
		int second = second();
		int third = third();
		return second + third;
	}

	private static int second()
	{
		int forth = forth();
		return forth + 1;
	}

	private static int third()
	{
		int fifth = fifth();
		return fifth + 1;
	}

	private static int forth()
	{
		int sixth = sixth(4);
		return sixth + 1;
	}

	private static int fifth()
	{
		int sixth = sixth(5);
		return sixth + 1;
	}

	private static int sixth(int i)
	{
		return i * 2;
	}
}
