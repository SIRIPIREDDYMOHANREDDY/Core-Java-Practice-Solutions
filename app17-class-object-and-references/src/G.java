class G 
{
	int i;
	int j;   
	void test()
	{
		System.out.println(j);	
	}

	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.j);
		g1.test();
		System.out.println(g1.i);
	}
}
// new G(); object creation by using new operator
//G g1 this is variable declaration
//g1 is a refference variable
//non static members are  object members when ever object  is creating that time non static calling
// static members are also called  class members