class K 
{
	static float test1(short s1)
	{
		return test2(s1);  // return (float) test2((int) 10)
	}
	static long test2(int s1)
	{
		return s1;  // return (long) 10
	}
	public static void main(String[] args) 
	{
		byte b1 = 10;
		double d1 = test1(b1);   // double d1 = (double) test((short) 10)
		System.out.println(d1);
	}
}
