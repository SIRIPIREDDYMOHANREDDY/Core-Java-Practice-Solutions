class X
{
	public static void main(String[] args) 
	{
		int i = 150;
		short s1 = (short) i;
		short s2 = (short) (byte) i;
		System.out.println(i);
		System.out.println(s1);
		System.out.println(s2);
	}
}
