abstract class A
{
	A()
	{
		System.out.println("A()");
	}
}
class  V extends A
{
	public static void main(String[] args) 
	{
		V v1 = new V();
		System.out.println("done");
	}
}
