class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B();
		System.out.println("----------");
		new B();
		System.out.println("----------");
		System.out.println("main end");
	}

	B()
	{
		System.out.println("B()");
	}
}
