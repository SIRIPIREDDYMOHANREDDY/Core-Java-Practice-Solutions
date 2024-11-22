class A
{
	A()
	{
		System.out.println("A()");
	}
}
class U extends A 
{
	U()
	{
		super(90);//error because there are no integer argument constructor in the super class A
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
