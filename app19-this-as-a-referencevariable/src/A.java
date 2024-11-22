class A 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("main:" + a1);
		a1.test();
	}
	void test()
	{
		System.out.println("test:" + this);
	}
}
// this as a refferencial variable avaible  evry non static definition block