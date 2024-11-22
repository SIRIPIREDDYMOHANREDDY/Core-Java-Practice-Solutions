class L
{
	static int a = L.c;
	static int b = L.c;	
	static int c = 20;	
  
	public static void main(String[] args) 
	{
		System.out.println("main:");
		System.out.println(L.a);
		System.out.println(L.b);
		System.out.println(L.c);
	}
}
