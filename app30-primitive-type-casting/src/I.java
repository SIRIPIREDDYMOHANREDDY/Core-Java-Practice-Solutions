class I 
{
	static double test()
	{
		int i = 10;
        return i;  // return (double) i;
	}
	public static void main(String[] args) 
	{
		double d1 = test();
		System.out.println(d1);
	}
}
