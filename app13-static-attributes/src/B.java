class B 
{
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static char h;    //char default value -'\u0000' but compiler gives blank space
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
