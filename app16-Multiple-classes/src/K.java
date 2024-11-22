class A
{
	static int i;
	static
	{
		System.out.println("A-SIB");
	}
}

class K 
{
	static
	{
		System.out.println("K-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("---------");
		A.i = 20;
		System.out.println(A.i);
		System.out.println("main end");
	}
}
