class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for(; ; ) // if there is no boolean condition always results true.
		{
			System.out.println("body begin:" + i++); 
		}
	}
}
