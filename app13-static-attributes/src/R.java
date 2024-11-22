class R 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(R.i);
		R.i = 20;
		System.out.println(R.i);
	}
}
  //  if we are using global static variables we must use class 
    