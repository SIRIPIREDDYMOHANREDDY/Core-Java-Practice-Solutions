class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)  
		{
			System.out.println("body begin:" + i);
			if(i <= 3 || i >= 9)
			{
				System.out.println("from if block");
				continue;  
			}
			System.out.println("body end:" + i);
		}
		System.out.println("main end");
	}
}
