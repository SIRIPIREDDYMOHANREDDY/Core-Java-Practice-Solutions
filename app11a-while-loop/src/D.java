class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		while(i-- >= 5)
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end:" + i);
	}
}
