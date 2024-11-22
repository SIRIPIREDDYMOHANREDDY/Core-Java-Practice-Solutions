class  I
{
	static int a;  //static members used any where in the class
	public static void main(String[] args) 
	{
		System.out.println(a);
	}

	I()
	{
		a = 30;
	}
                      //but non-static members not use directly in the static members
	void test()
	{
		a = 50;
	}

	static 
	{
		a = 40;
	}

	{
		a = 400;
	}
}
