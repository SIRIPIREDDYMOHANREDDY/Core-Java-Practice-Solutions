class C
{
	int i;
	int j;
}
class  D extends C
{                // class D contains i,j,p and q. i and j are called inheritant members, p and q are called incorporated members.
	int p;
	int q;
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.p);
		System.out.println(d1.q);
	}
}
