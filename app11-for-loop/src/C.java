class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)   
		{      // loop body contains any type of statments
			int j = 30;
			System.out.println("loop body:" + i);  
			System.out.println("loop body:" + i);  
			j++;
			System.out.println("loop body:" + i);  
			System.out.println("------------" + j);  
		}
		System.out.println("main end");
	}
}
