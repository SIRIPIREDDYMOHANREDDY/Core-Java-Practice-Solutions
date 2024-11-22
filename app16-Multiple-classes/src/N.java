class A 
{
	public static void main(String[] args) 
	{
		System.out.println("A-main");
	}
	static 
	{
		System.out.println("A-SIB");
	}
}
class N
{
	static
	{
		System.out.println("N-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("N-main begin");
		A.main(args);
		System.out.println("N-main end");
	}
}
