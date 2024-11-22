class Z10
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("outer loop begin:" + i);
			for(int j = 101; j <= 105; j++)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				System.out.println("inner loop end:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
		System.out.println("main end");
	}
}
