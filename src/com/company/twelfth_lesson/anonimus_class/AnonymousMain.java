package com.company.twelfth_lesson.anonimus_class;

public class AnonymousMain
{
	public static void main(String[] args)
	{
		AnonimousInterface anonimusInterface = new AnonimousInterface()
		{
			@Override
			public void helloWorld()
			{
				printText();
			}

			private void printText()
			{
				System.out.println("Text");
			}
		};

		anonimusInterface.helloWorld();
	}
}
