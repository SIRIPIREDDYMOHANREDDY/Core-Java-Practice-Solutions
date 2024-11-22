class E 
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			System.out.println("outer begin:" + i);
			for(int j = 101; j <= 103; j++)
			{
				System.out.println("inner loop:" + i + ", " + j);
			}
			System.out.println("outer end:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end");
	}
}
