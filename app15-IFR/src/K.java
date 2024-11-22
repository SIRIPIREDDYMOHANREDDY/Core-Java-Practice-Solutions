class K
{
	static int b = K.a;  //0 only top to bottom
	static int a = 12;	
  
	public static void main(String[] args) 
	{
		System.out.println("main:" + K.a + "," + K.b);
	}
}
