class M22 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		B b1 = (B) a1;
		C c1 = (C) a1;
		System.out.println("-------11-------");
		A a2 = new B();
		B b2 = (B) a2;
        System.out.println("-------22-------");
		C c2 = (C) a2;
		System.out.println("-------33-------");
	}
}
