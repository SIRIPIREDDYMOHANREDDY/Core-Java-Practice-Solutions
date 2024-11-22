class  N
{
	public static void main(String[] args) 
	{
		System.out.println(10 == 10 || 10 == 20);
		System.out.println(10 > 10 || 10 > 20);
		System.out.println(10 > 10 || 10 < 20);
		System.out.println(10 < 10 || 10 < 20);
		System.out.println(10 != 10 || 10 < 20);
		System.out.println(10 != 10 || 10 == 20);
		System.out.println(10 != 10 || 10 == 20);
		System.out.println(10 != 10 || 10 > 20);
		System.out.println(10 == 10 || 10 > 20);
		System.out.println(10 != 10 || 20 > 20);
		System.out.println(10 <= 10 || 20 > 200);
	}
}
