class P 
{
	P(int i)
	{
		this();
		System.out.println("P(int)");
	}
	P()
	{
		System.out.println("P()");
	}
	public static void main(String[] args) 
	{
		P p1 = new P(20);
		System.out.println("-------------");
		P p2 = new P();
		System.out.println("-------------");
	}
}
// calling one constructor  to another constructor