class M10 
{
	public static void main(String[] args) 
	{
		A a1 = new B();   // child class object assign to parent class reference variable
		B b1 = new C();
		C c1 = new D();
		A a2 = new D();
		System.out.println("done");
	}
}
