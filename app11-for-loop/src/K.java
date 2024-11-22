class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)  
		{
			System.out.println("body begin" + i);
			if(i == 4)
			{
				System.out.println("from if block");
				continue;  // when condition true it skips the remaining portion of the current iteration.
			}
			System.out.println("body end" + i);
		}
		System.out.println("main end");
	}
}
