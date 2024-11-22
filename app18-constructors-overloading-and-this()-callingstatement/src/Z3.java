class A
{
	A(int i)
	{
		System.out.println("A()");
	}
}
class  Z3
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("--------------");
		A a2 = new A(90, 40);
		System.out.println("--------------");
	}
}
