class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class O extends A
{
	O(int i)
	{
		super(i);  // complier will not provide one more super
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{
		O o1 = new O(90);
		System.out.println("done");
	}
}
