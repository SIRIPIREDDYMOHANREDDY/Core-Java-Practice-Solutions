class M20 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		C c1 = (C) a1;
		System.out.println("--------------");
		A a2 = new A();
		C c2 = (C) a2;
		System.out.println("--------------");
	}
}
