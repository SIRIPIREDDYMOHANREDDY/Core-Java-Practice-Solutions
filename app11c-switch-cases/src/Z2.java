class Z2 
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 10;
		switch (i)
		{
		    case 5:
				System.out.println("case 5");
                break;
		    case j:  //error - one case is allocated to one value
				System.out.println("case 10");
                break;
		}
		
	}
}
