class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  P extends A
{
	P(int i)
	{
		super(90);
		System.out.println("P(int)");
	}
	public static void main(String[] args) 
	{
		P p1 = new P(10);
		System.out.println("done");
	}
}
