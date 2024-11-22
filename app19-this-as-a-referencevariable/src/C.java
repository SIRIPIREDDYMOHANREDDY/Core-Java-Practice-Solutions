class C 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
	static void test()
	{
		System.out.println(this);
	}
}

// inside static method we cannot use this is refference