class O 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls supply one int command line args");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch(i)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println(i + " is odd value");
			    break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println(i + " is even value");
			    break;
			default:
				System.out.println("pls supply 1 or 10");
		}
		
	}
}
