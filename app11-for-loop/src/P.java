class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)  
		{
			System.out.println("body begin:" + i);
			if(i == 3)
			{
                break;  // error - break should be last statement int current definition block
				System.out.println("from if block");  
			}
			System.out.println("body end:" + i);
		}
		System.out.println("main end");
	}
}