class M4 
{
	static B test1()
	{
		return new B();
	}
	public static void main(String[] args) 
	{
		B b1 = test1();
		System.out.println("done");
	}
}
