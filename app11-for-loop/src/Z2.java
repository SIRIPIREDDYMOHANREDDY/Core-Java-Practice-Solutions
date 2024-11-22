class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1, j = 10; i <= 8 || j >= 1; i++, j--) 
		{
			System.out.println("body begin:" + i + ", " + j); 
		}
	}
}
