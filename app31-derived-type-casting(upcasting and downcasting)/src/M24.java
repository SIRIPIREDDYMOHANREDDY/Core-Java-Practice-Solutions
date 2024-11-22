class M24 
{
	public static void main(String[] args) 
	{
		B b1 = new D();
		A a1 = b1;
		C c1 = (C) b1;
		D d1 = (D) c1;
		System.out.println("---1---");
		B b2 = new C();
		A a2 = b2;
		C c2 = (C) b2;
		System.out.println("---2---");
		D d2 = (D) c2;
		System.out.println("---3---");
	}
}
