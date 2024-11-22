 class A 
{
	A(int i)
	{
		System.out.println("A()");
	}
}
class  N extends A
{
	N(int i)          //we get error because compiler default keep super with no argument constructor but there is no no argument in super class A 
	{
		//super();
		System.out.println("N(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
