class  B
{
	public static void main(String[] args) 
	{
		int i = 10;
		double j = i;  // double j = (double)i; auto widening-compiler automatically do this in class file
		System.out.println(i);
		System.out.println(j);
	}
}
