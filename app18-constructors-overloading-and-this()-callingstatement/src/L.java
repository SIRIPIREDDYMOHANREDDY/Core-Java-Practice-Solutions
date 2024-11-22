class L 
{
	L(int i)
	{
		System.out.println("L(int)");
	}
	L(double i)	
	{
		System.out.println("L(double)");
	}
	L(boolean i)
	{
		System.out.println("L(boolean)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj1 = new L(10);
		System.out.println("----------");
		L obj2 = new L(23.4);
		System.out.println("----------");
		L obj3 = new L(false);
		System.out.println("----------");
		System.out.println("main begin");
	}
}
