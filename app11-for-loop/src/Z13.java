class Z13
{
	public static void main(String[] args) 
	{
		abc:  // on top of the loop we can give a name or label to the loop by ending the label with ':'
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("outer loop begin:" + i);
			for(int j = 101; j <= 105; j++)
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if(j == 103)
				{
					break abc;
				}
				System.out.println("inner loop end:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
		System.out.println("main end");
	}
}
