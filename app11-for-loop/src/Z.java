class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1, j = 10; i <= 55; i += 5, j -= 2) 
		{
			System.out.println("body begin:" + i + ", " + j); 
		}
	}
}
