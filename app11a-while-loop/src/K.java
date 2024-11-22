class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i++ <= 5)
		{
			System.out.println("outer loop begin:" + i);
			int j = 101;
			while(j <= 105)
			{
				System.out.println("inner loop begin:" + i  + ", " + j);
				if (j == 102)
				{
					j++;
					continue;
				}
				System.out.println("inner loop end:" + i  + ", " + j);
				j++;
			}
			System.out.println("outer loop end:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}
