class Z9 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++);  // error for loop is ended due to '; ' . we can't use i outside the loop
		{
			System.out.println("loop stmt1" + i);
		}
			System.out.println("main end");
	}
}
