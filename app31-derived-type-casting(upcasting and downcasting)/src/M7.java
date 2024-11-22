class M7 
{
	static C test()
	{
		return new D();      // return (C) new D();
	}
	public static void main(String[] args) 
	{
		B b1 = test();    // (C) test();
		System.out.println("done");
	}
}
