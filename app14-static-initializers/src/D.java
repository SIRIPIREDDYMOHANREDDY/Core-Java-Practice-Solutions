class D 
{
	static 
	{
		System.out.println("SIB1 begin");
		main(null);
		System.out.println("SIB1 end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
	}

	static 
	{
		System.out.println("SIB2");
	}
}
// array is a drivied data type