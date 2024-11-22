class Z4 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j;
		j = 10;
		switch (i)
		{
		    case 5:
				System.out.println("case 5");
                break;
		    case j:  //error - even though j is constant it intialized in another line. j should be declared and initialized in the same line.
				System.out.println("case 10");
                break;
		}	
	}
}
