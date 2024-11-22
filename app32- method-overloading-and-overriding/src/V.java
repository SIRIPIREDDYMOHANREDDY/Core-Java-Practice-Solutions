class A
{
	void test()
	{
		System.out.println("A-test()");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("B-test()");
	}
}
class V
{
	public static void main(String[] args) 
	{
		A a1 = new A();
        B b1 = new B();
		A[] elements = {a1,b1};
		for(A element : elements)
		{
			element.test(); //it executed two times and produce different outputs. So it shows polymorpism 
		}
	}
}
