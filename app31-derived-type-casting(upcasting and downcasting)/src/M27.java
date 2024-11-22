class M27 
{
	public static void main(String[] args) 
	{
		Object o1 = new B();
		A a1 = (A) o1;
		System.out.println("-----1------");
		B b1 = (B) o1;
		System.out.println("-----2------");
		C c1 = (C) o1;
		System.out.println("-----3------");
		D d1 = (D) o1;
		System.out.println("-----4------");
	}
}
