class Z2 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i++ + i + i++ + i + i++ + i++ + i + i-- + i++ + i + ++i + i + --i + i++ + i-- + i + --i + i++ + i++ + ++i + ++i + --i + i++ + ++i + i;
		     // 1     2     3   3    4    4     5    6     6    5     6    7    7   6     6     7    6     5    5    6       8    9      8     8     10   10
		System.out.println(i);
		System.out.println(j);
	}
}
