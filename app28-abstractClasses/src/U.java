abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1");
	}
}

abstract class C extends B
{
	void test2()
	{
		System.out.println("C-test2");
	}
}

class D extends C
{
    void test3()
	{
		System.out.println("D-test3");
	}
}
class U
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
		System.out.println("done");
	}
}
