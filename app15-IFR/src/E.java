class E 
{
	static int i = E.j;  // error because Direct read not allowed before JVM notified

	static int j=20;

	public static void main(String[] args) 
	{
        System.out.println(i);
		System.out.println(j);
		System.out.println("done");
	}
}
