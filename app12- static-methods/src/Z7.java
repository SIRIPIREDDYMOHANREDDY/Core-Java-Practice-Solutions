class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	public static void test1()
	{
	   System.out.println("test1 begin");
	   if (true)
	   {
		  return;
		  System.out.println("something");
	   }
	   System.out.println("test2 end");
	}
}
