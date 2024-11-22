class Z15
{
	public static void main(String[] args) 
	{
		abc: 
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("outer loop begin:" + i);
			inner:
			for(int j = 101; j <= 105; j++)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if(j == 103)
				{
					continue inner;
				}
				System.out.println("inner loop end:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
		System.out.println("main end");
	}
}
