class A
{
	static int i;

	static
	{
		System.out.println("A-SIB");
	}
}
class  B extends A
{
	static int j;
	
	static
	{
		System.out.println("B-SIB");
	}	
}
class E extends B
{
	static 
	{
	    System.out.println("E-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main"); 
	}
}
