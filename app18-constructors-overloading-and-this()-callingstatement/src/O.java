class O 
{
	O(int i)
	{
		System.out.println("O(int)");
	}
	O(double i)  // unused construstor also can be developed
	{
		System.out.println("O(double)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O(90);
		System.out.println("-----------");
		O o2 = new O(190);
		System.out.println("-----------");
		System.out.println("main end");
	}
}
