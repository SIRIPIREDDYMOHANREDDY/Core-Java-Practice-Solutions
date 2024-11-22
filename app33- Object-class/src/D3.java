class A
{
	int i;
}
class  D3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		String s1 = "the content of a1 is :" + a1;
		String s2 = "the content of a1 is :" + a1.toString();
		System.out.println(a1);
		System.out.println(a1.toString());
		System.out.println(s1);
		System.out.println(s2);
	}
}
