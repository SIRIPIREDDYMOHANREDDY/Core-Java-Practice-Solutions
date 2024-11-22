class F 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		   System.out.println("pls supply one int type command line argument");
		   return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		int j = i * i;
        System.out.println("the square of " + i + " is " + j);
	}
}
