class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("do-while body begin:" + i);
			if(i == 2)
			{
				i++;
				break;
			}
			System.out.println("do-while body end:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}
