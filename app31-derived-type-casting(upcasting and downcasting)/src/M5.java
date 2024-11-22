class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1 = new C();
		a1 = new C();
		B b1 = null;
		b1 = new C();     // b1 = (B) new C();
		b1 = new D();
		C c1 = null;
		Object o1 = new D();    // object o1 = (Object) new D();
		o1 = new C();
		o1 = new A();
		o1 = a1;
		a1 = c1;        // a1 = (A) c1
		b1 = c1;
		System.out.println("done");
	}
}
