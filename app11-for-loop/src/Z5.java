class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		// int p = 1, q = 4, r = 3;
		for(int i = 1, System.out.println("int:" + i);// error because after ',' there is no variable but int expected another variable. So SOP is not allowed after ",".
		    test(i);
			System.out.println("before changes:" + i),
			i++,
			System.out.println("after cganges:" + i)
			)
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end:");
	}
	static boolean test(int i)
	{
		boolean flag = i <= 5;
		System.out.println("boolean status for " + i + ":" + flag); 
		return flag;
	}
}
