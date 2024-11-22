class M1 
{
	public static void main(String[] args) 
	{
		//A a1 = new A();

		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();
		A a4 = A.getObject();
		A a5 = A.getObject();
		A a6 = A.getObject();
		A a7 = A.getObject();
		A a8 = A.getObject();
		A a9 = A.getObject();
		A a10 = A.getObject();
		
		System.out.println(a1 == a3);
		System.out.println(a3 == a7);
		System.out.println(a2 == a7);
		System.out.println(a5 == a10);
	}
}
