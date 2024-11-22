class  P
{
	public static void main(String[] args) 
	{
		int i = 1;
		if (true || ++i == i++)
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
