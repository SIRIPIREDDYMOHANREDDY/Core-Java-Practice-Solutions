class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 100; i >= 1; i = i - 8)  // i -= 8
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end");
	}
}
