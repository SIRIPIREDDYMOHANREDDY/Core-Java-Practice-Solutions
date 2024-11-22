class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	public static void test1()
	{
		System.out.println("test begin");
		int i = 10;
		System.out.println("test:" + i);
		i++;
		System.out.println("test:" + i);
		System.out.println("end test");
	}

}
