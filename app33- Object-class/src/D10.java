class D10 
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuilder sb2 = new StringBuilder("test");
		System.out.println(s1);  // here we are getting content not the memory address. Because all wrapper classes override the toString method.
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
