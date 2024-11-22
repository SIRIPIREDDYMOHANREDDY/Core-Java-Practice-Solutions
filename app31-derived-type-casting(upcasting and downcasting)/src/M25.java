class M25 
{
	public static void main(String[] args) 
	{
		C c1 = new D();
		A a1 = c1;
		B b1 = c1;
		D d1 = (D) c1;
		System.out.println("------11-----");
		C c2 = new C();
		A a2 = c2;
		B b2 = c2;
		D d2 = (D) c2;
		System.out.println("------22-----");
	}
}
