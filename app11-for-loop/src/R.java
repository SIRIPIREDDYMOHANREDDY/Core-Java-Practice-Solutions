class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for(; i <= 10; i++)
		{
			System.out.println("body begin:" + i);
		}
		System.out.println("main end:" + i);
	}
}
