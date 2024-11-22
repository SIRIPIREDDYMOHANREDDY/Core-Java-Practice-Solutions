package pack1;
class  A
{
	private A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int i)");
	}
}
class J extends A
{
	J()
	{
		super(90);
		System.out.println("J()");
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("Hello World!");
	}
}
