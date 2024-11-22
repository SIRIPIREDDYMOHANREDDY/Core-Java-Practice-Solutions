class A
{
	int i;
}
class  E extends A
{
	int p;
	int q;
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.i = 10;
		e1.p = 20;
		e1.q = 30;
		System.out.println(e1.i + ", " + e1.p + ", " + e1.q);
	}
}
