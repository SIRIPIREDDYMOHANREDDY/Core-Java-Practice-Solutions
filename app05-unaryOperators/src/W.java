class W 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i++ + i++ + i++ + i++ + i++ + i;
		      // 1     2     3     4    5     6     7
		System.out.println(i);
		System.out.println(j);
	}
}
