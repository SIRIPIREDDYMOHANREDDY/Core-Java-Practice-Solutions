class M
{
	static int a = test();
	static int b = 20;	
	static int test()
	{
		return b;
	}
  
	public static void main(String[] args) 
	{
		System.out.println("main:");
		System.out.println(a);
		System.out.println(b);
	}
}
