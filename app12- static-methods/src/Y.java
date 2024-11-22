class Y 
{
	public static void main(String[] args) 
	{
		System.out.println("main1");
		if (true)
		{
			System.out.println("if block");	
		    return;
		}
		System.out.println("main2");
	}
}


//we are not getting main 2 because main before there is a return that return statement back to caller of the method