class D 
{
	static int i;
	static int j = i;   //direct read
	static int k = D.i;  //indirect read
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
