
class A
{
	static int i;
}
class G 
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
		A.i = 30;
		System.out.println(A.i);
	}
}
// we can use other class members with their  class names