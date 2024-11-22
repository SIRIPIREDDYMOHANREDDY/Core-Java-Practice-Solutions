class M8 
{
	static A test1(C c1)
	{
		return test2(c1);   //  (A) test2(c1);
	}
	static B test2(C obj)
	{
		return obj;    // (B)  obj
	}
	public static void main(String[] args) 
	{
		D d1 = null;
		Object o1 = test1(d1);  //Object o1 = (Object) test1((C) d1);
		System.out.println("done");
	}
}
