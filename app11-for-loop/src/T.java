class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 100;
		for(i = 1; i <= 10; i++)
		{
			System.out.println("body begin:" + i);
		}
		System.out.println("main end:" + i);
		System.out.println("main end:" + i);
	}

}

