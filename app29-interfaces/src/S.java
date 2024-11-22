 interface A
{
	void test1();
}
class B
{
	public void test1()
	{
		System.out.println("B-test1");
	}
}
class  S extends B implements A  //inside S- A automatically override with B method due to same name and return type
{
	public static void main(String[] args) 
	{
		S s1 = new S();
        s1.test1();
		//s1.test2();
		System.out.println("Hello World!");
	}
}
 