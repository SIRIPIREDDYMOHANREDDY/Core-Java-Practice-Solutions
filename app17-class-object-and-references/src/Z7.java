class A
{
	int i;
}

class  Z7
{
	static void test(A obj)
	{
		System.out.println("test:" + obj.i);
	    obj.i = 10;
		System.out.println("test:" + obj.i);
	}
	public static void main(String[] args) 
	{
		test(new A());
		System.out.println("done");
	}
}
