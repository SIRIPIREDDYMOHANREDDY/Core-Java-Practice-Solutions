class A
{
	A()
	{
		super();
		System.out.println("A()");
	}
}
class  L extends A
{
	L()
	{
		super();
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println("done");
	}
}
