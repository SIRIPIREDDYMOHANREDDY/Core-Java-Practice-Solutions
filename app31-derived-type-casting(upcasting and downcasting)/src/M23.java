class M23 
{
	public static void main(String[] args) 
	{
		A a1 = new D();
		B b1 = (B) a1;
		System.out.println("------1------");
		C c1 = (C) a1;
		System.out.println("------2------");
		D d1 = (D) a1;
		System.out.println("------3------");
		A a2 = new C();
		B b2 = (B) a2;
		System.out.println("------4------");
		C c2 = (C) a2;
		System.out.println("------5------");
		D d2 = (D) a2;
		System.out.println("------6------");
	}
}
