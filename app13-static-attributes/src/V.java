class V 
{
	static int i = 10;
	static int j;
	static int k = test();
	static int test()
	{
		System.out.println("from test:" + i + "," + j + "," + k);
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + "," + j + "," + k);
	}
}
