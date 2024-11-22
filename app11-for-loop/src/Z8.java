class Z8 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++);  // here no statements inside for loop body due to ';'
		{
			System.out.println("loop stmt1");
			System.out.println("loop stmt2");
			System.out.println("loop stmt3");
			System.out.println("loop stmt4");
		}
			System.out.println("main end");
	}
}
