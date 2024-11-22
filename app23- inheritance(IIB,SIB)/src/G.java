class A
{
	int p;
}
class  G 
{
	A a1;  //A type attribute
	int q;

	void test()
	{
		System.out.println(a1.p);
		System.out.println(q);
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.test();
		System.out.println("done");
	}
}
