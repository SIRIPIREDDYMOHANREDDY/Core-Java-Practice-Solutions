class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  V extends A
{
	V(int i)
	{   /*error because compiler provide super(); with no arguments but in the super class A no argument constructor is not available */
		System.out.println("V(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
