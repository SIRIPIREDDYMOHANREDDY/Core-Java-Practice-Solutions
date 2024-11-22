class N 
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
				System.out.println(i + " is odd value");
			    break;
			case 2:
				System.out.println(i + " is even value");
			    break;
			case 3:
				System.out.println(i + " is odd value");
			    break;
			case 4:
				System.out.println(i + " is even value");
			    break;
			case 5:
				System.out.println(i + " is odd value");
			    break;
			case 6:
				System.out.println(i + " is even value");
			    break;
			case 7:
				System.out.println(i + " is odd value");
			    break;
			case 8:
				System.out.println(i + " is even value");
			    break;
			case 9:
				System.out.println(i + " is odd value");
			    break;
			case 10:
				System.out.println(i + " is even value");
			    break;
			default:
				System.out.println("pls supply 1 or 10");
		}
		
	}
}
