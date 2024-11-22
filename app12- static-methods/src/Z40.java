class Z40
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(false,40);
		System.out.println("main end");
	}
	public static void test(int i,boolean j)
	{
		System.out.println("test:" + i + "," + j);
	}
}
//compalition errror