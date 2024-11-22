class Z54 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test(++i); //test(2) i = 2
		System.out.println("main:" + i + ", " + j);// j = 3
	}
	public static int test(int i)
	{
		System.out.println("test:" + i);//i = 2
		return ++i;
		//return 3
	}
}
