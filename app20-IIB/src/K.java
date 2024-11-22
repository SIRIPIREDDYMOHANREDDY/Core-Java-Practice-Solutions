class K 
{
	static int count;
	K()
	{
		//several statements
	}
	K(int i)
	{
		//several statements
	}
	K(double i)
	{
		//several statements
	}
	K(boolean i)
	{
		//several statements
	}
	{
		count++;
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		K k2 = new K(10);
		K k3 = new K(10.0);
		K k4 = new K(true);
		System.out.println(count);
	}
}