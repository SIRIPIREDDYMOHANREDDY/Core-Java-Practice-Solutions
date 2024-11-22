class M 
{
	public static void main(String[] args) 
	{
		double i = 10;
		int j = i;     //error - storing wider one in narrower is not possible
		System.out.println(i);
		System.out.println(j);
	}
}
