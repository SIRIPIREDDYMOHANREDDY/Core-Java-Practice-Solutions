class J 
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		//test();
		J ref = new J();
		ref.test();
		ref.test();
		ref.test();
		ref.test();
		ref.test();
		ref.test();
		System.out.println("Hello World!");
	}
}
//we cannot call test method directly because it is a non static method
// non static methods are called when object created
// non static member cannot be used without refference variable