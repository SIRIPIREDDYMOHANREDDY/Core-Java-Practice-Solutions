interface A
{
	void test1();
}  
interface B
{
	void test2();
}  
class N implements A, B //it is called multiple inheritance.
{
	public void test1()
	{
		System.out.println("N-test1");
	}
	public void test2()
	{
		System.out.println("N-test2");
	}
	public static void main(String[] args) 
	{
        N n1 = new N();
		n1.test1();
		n1.test2();
		System.out.println("done");
	}
}
