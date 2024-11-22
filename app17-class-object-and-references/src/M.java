class M 
{
	int i;

	static
	{
		M m1 = new M();
        System.out.println(m1.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//using non static member in the SIB	 