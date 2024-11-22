class J 
{
	static int test()
	{
		byte b1 = 10;
		return b1;        // return (int) b1;
	}
	public static void main(String[] args) 
	{
		float f1 = test();  // float f1 = (float) test();
		System.out.println(f1);
	}
}
