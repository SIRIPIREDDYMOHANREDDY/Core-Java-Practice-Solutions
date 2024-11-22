class M2 
{
	public static void main(String[] args) 
	{
		Object o1 = null;
		Object o2 = null;
		o1 = o2;
		o2 = o1;

		A a1 = new A();
		A a2 = a1;
		a1 = a2;

		C c1 = null;
		C c2 = new C();
		c1 = c2;
		c2 = c1;

		System.out.println("done");
	}
}
