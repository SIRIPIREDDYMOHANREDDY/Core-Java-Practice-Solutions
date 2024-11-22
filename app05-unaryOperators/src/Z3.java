class Z3 
{
    public static void main(String[] args)
	{
		int i = 1;
		int j = i++ + ++i + i++ + ++i;
		     // 1     3     3      5
		System.out.println(i);
		System.out.println(j);
	}
}
