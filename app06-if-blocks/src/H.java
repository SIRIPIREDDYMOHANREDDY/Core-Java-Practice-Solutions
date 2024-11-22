class H 
{
	public static void main(String[] args) 
	{
		int i = 10;
		if (true)
		{
			System.out.println("Inside if block:" + i);
			i += 10;   // i = i + 10;
		}
		System.out.println("after if block:" + i);
	}
}


//10
//20