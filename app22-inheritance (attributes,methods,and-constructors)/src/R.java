class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  R extends A
{                     // it gives error because compiler provide no argument constructor. inside that constructor also compiler provide super with no arguments (super();) 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
