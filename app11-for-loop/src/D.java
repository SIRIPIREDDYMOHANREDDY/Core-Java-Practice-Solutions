class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)   
		{
			System.out.println("loop body:" + i);  
			System.out.println("loop body:" + i);  
			System.out.println("loop body:" + i);  
			System.out.println("------------");  
		}
		System.out.println("main end" + i); // i is local to for loop. we can't use i outside of the loop. 
	}
}
