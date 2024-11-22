class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i, String s1)
	{
		this();
		System.out.println("S(int, String)");
	}
	S(int i, int j)
	{
		this(10, "abc");
		System.out.println("S(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		S s1 = new S();
		System.out.println("----------");
		S s2 = new S(20, 40);
		System.out.println("----------");
		S s3 = new S(20, "abc");
		System.out.println("----------");
		System.out.println("main end");
	}
}
