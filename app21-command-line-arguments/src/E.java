class E
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		    System.out.println("pls supply one command line argument");
			return;
		}
		String name = args[0];
        System.out.println("Hello " + name);
	}
}
