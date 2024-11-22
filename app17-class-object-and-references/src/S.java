class S 
{
	int i;

	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = new S();
		s1.i = 10;
		s2.i = 20;
		System.out.println(s1.i);
		System.out.println(s2.i);
		s1.i = 30;
		s2.i = 50;
		System.out.println(s1.i);
		System.out.println(s2.i);
	}
}
// same class  we can create   multiple objects