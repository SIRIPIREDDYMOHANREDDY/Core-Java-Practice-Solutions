class L 
{
	public static void main(String[] args) 
	{
		int i = 10;
		double d1 = (double) i;  //explicit coversion doesn't require in case of widening. Compiler automatically do this.
		System.out.println(i);
		System.out.println(d1);
	}
}
