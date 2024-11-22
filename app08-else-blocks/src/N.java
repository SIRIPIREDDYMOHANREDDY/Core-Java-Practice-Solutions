class  N
{
	public static void main(String[] args) 
	{
		int i = 1;
		if (i++ == i++)
        //   1  == 2
		{
			System.out.println("if:" + i);
			i += 10;
		}
		else 
		{
			System.out.println("else:" + i);
			i += 20;
		}
		System.out.println("main end:" + i);
	}
}
