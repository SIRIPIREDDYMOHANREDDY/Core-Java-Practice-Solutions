class N 
{
	public static void main(String[] args) 
	{
		double i = 10;
		int j = (int) i;      //succes - here we are explicitly narrowing the wider one and then store to narrower value 
		System.out.println(i);
		System.out.println(j);
	}
}
