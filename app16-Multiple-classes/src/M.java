class A 
{
	public static void main(String[] args) 
	{
		System.out.println("A-main");
	}
}
class M
{
	public static void main(String[] args) 
	{
		System.out.println("M-main begin");
		A.main(null);
		System.out.println("M-main end");
	}
}
