class Q
{
	static int i = 20;
	public static void main(String[] args) 
	{
		System.out.println(i);
		String i = "abc";
		System.out.println(i);
		System.out.println(Q.i);
	}
}
 // if we want execute static variables after local variables we must  call with class name