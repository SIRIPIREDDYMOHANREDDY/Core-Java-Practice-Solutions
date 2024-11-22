class Z51 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test(i++); //test(1) i = 2
		System.out.println("main:" + i + ", " + j);// j = 1
	}
	public static int test(int i)
	{
		System.out.println("test:" + i);//i = 1
		return i++;
	}
}
