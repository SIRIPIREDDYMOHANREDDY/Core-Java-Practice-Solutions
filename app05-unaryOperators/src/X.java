class X 
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = i-- + i-- + i-- + i-- + i-- + i-- + i;
		      // 10    9     8    7     6      5    4
		System.out.println(i);
		System.out.println(j);
	}
}
 
