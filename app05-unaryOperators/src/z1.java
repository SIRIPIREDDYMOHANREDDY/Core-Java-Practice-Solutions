class Z1 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = ++i + i + ++i + i + i++ + i + ++i + i + i++ + i;
		      // 2    2    3    3    3    4    5    5    5    6
		System.out.println(i);
		System.out.println(j);
	}
}
