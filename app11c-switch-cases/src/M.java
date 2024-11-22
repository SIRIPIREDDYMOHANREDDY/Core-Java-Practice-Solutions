class M 
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
			case 5:
				System.out.println("I am from 5");
			    break;
			case 15:
				System.out.println("I am from 15");
			    break;
			default:
				System.out.println("pls supply 5 or 15");
			    break;
		}
		
	}
}
