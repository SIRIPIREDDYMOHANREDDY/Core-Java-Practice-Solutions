class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i++ <= 5);
		{
			System.out.println("body begin:" + i);
			System.out.println("body end:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}
