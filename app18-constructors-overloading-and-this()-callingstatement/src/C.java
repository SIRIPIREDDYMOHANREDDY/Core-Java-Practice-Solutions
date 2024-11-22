class C 
{
	C()
	{
		System.out.println("C-constructor-stmt1");
		System.out.println("C-constructor-stmt2");
		System.out.println("C-constructor-stmt3");
		System.out.println("C-constructor-stmt4");
		System.out.println("C-constructor-stmt5");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("----------");
		new C();
		System.out.println("----------");
		C c2 = new C();
		System.out.println("----------");
	}
}
