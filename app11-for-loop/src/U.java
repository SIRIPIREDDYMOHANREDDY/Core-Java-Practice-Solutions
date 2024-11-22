class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10;) // changes section can also be a blank
		{
			System.out.println("body begin:" + i);
			i++;
		}
		System.out.println("main end:");
	}
}
