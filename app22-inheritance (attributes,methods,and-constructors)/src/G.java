class A
{
	int i;

	void test1()
	{
		System.out.println("A-test1");
	}
}
class  G extends A
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
		g1.test1();
		g1.i = 40;
		System.out.println(g1.i);
	}
}
