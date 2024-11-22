class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class  Q extends A
{
	Q()
	{
		System.out.println("Q()");
	}
	Q(int i)
	{
		System.out.println("Q(int)");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		System.out.println("--------------");
		Q q2 = new Q(90);
		System.out.println("--------------");
	}
}
