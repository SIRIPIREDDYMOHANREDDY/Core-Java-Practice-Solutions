class A
{
	private int i;
}
class  G extends A
{
	public static void main(String[] args) 
	{
		G f1 = new G();
		System.out.println(f1.i);
		A a1 = new A();
		System.out.println(a1.i);
	}
}
