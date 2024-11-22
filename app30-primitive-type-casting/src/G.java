class G 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		test(b1);      //test((int) b1)
		System.out.println("main:" + b1);
	}
	static void test(int i)
	{
		System.out.println("test" + i);
	}
}
