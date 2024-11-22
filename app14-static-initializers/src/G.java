class G
{
	static int i = test();  // first
	static
	{
		System.out.println("SIB:" + i); //second
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
	public static int test() 
	{
		System.out.println("test:" + i);
		return 10;
	}
}
