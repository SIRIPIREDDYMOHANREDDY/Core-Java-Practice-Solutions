interface A
{
	void test1();
	void test2();
	void test3();
}
abstract class B implements A
{
	public void test1()
	{
		System.out.println("B-test1");
	}
}
abstract class C extends B
{
	public void test2()
	{
		System.out.println("C-test2");
	}
}
class  L extends C
{   
    public void test3()
	{
		System.out.println("L-test3");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("Hello World!");
	}
}
