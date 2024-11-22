class Y 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i + i-- + i + i++ + i++ + i + i-- + i;
		      // 1    2   2     1    1     2    3    3    2
		System.out.println(i);
		System.out.println(j);
	}
}
