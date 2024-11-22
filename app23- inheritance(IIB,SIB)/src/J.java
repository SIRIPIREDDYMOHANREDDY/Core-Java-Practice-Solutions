class A
{
	A()
	{
	    System.out.println("A()");	
	}
	A(int i)
	{
		this();
		System.out.println("A(int)");
	}

	{
		System.out.println("A-IIB");
	}
}
class  J extends A
{
	J()
	{
		this(90);
		System.out.println("J()");
	}
	J(int i)
	{
		System.out.println("J(int)");
	}
	{
		System.out.println("J-IIB");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		A a2 = new A(10);
		System.out.println("------------");
		J j1 = new J();
		System.out.println("------------");
		J j2 = new J(10);
		System.out.println("------------");
		
	}
}
