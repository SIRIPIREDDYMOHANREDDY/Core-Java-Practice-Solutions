class A
{
	int i;
}
class X
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.i = 10;
		System.out.println(a1.i);
	}
}
