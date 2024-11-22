class Z55 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test(i++ + i++); 
		//      test(1   +  2) i = 3
		//      test(3)
		System.out.println("main:" + i + ", " + j);// j = 13
	}
	public static int test(int i)
	{
		System.out.println("test:" + i);//i = 3
		return i++ + ++i + i++;
		//return 3  + 5   + 5    i = 6
		//return 13
	}
}
