interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C extends A, B //same interface can extends multiple no.of super interfaces again here we can see multiple inheritance
{
	void test3();
}
class  T implements C //sub class can implements any no.of super interfaces
{
	public void test1()
	{
		System.out.println("T-test1");
	}
	public void test2()
	{
		System.out.println("T-test2");
	}
	public void test3()
	{
		System.out.println("T-test3");
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		t1.test1();
		t1.test2();
		t1.test3();
		System.out.println("Hello World!");
	}
}
