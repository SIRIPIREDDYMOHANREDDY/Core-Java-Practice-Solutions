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
class  W extends A
{
	W()
	{
		System.out.println("W()");
	}
	W(int i)
	{
		System.out.println("W(int)");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("------------");
		W w2 = new W(90);
	}
}
