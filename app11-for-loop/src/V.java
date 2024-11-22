class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10;) 
		{
			System.out.println("body begin:" + i++); // we can do increment in line itself
		}
		System.out.println("main end:");
	}
}
