class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 100; i = i + 15)  // i += 15
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end");
	}
}
