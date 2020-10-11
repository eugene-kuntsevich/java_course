package com.company.twelfth_lesson.local_class;

public class LocalClass
{
	public void myMethod()
	{
		class MyClass
		{
			int i;

			public MyClass(int i)
			{
				this.i = i;
			}
		}

		MyClass myClass = new MyClass(9);
	}

	public void myMethod2()
	{
		//MyClass myClass = new MyClass();
	}
}
