class C 
{
	static int i;

	static
	{
		System.out.println(C.i)  //indirect read
		C.i = 10;  //indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
