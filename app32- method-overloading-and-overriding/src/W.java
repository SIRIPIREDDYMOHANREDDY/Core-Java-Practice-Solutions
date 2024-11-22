class A
{
	static void test()
	{
		System.out.println("A-test()");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("B-test()");
	}
}
class W
{
	public static void main(String[] args) 
	{
		A a1 = new A();
        B b1 = new B();
		A[] elements = {a1,b1};
		for(A element : elements)
		{
			element.test(); //it executed two times and produce same output becasuse static methods not involving in the polymorpism 
		    // A.test();  - compiler change itself due to static method 
		}
	}
}
