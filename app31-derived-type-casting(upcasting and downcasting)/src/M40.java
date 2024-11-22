class M40
{
	public static void main(String[] args) 
	{
		Object o1 = new D();
		D d1 = (D) o1;
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.k);
		System.out.println(d1.l);
		d1.test1();
		d1.test2();
		d1.test3();
		d1.test4();
	}
}