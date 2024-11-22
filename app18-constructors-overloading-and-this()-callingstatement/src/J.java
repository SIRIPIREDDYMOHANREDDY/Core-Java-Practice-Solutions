class J 
{
	J(String s1, int i)
	{
		System.out.println("J():" + s1 + ", " + i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main  begin");
		J j1 = new J("abc", 12);
		System.out.println("---------------");
		J j2 = new J("xyz", 121);
		System.out.println("---------------");
		J j3 = new J("test", 112);
		System.out.println("---------------");
		System.out.println("main  end");
	}
}
