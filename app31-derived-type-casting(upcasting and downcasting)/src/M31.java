class M31 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.test1();
		b1.test2();

		A a1 = new B();        // by using a1 we can access class A members only because compiler check type of the reference variable
        System.out.println(a1.i);
        System.out.println(a1.j);  // error - were are not able to use object members in upcasting
		a1.test1();
		a1.test2();
	}
}
