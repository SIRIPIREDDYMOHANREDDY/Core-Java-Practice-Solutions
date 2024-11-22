class L 
{
	static int i;   // it is global varible
	public static void main(String[] args) 
	{
		System.out.println(i);
		int i = 20; // it is local variable  // if you have global varible  and local varible same name  most scope or preference is local variable
		System.out.println(i);
	}
}
// two local variables should not be a same name
// two global varibles should not  be a same name not possible