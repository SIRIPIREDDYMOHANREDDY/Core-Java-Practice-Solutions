class Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("int:" + i);
		    test(i);
			System.out.println("before changes:" + i),
			i++,
			System.out.println("after cganges:" + i)
			)
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end:" + i);
	}
	static boolean test(int i)
	{
		boolean flag = i <= 5;
		System.out.println("boolean status for " + i + ":" + flag); 
		return flag;
	}
}
