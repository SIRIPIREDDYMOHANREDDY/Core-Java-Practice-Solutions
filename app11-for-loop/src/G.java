class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 100; i >= 10; i = i/5)  // i /= 5
		{
			System.out.println("body:" + i);
		}
		System.out.println("main end");
	}
}
