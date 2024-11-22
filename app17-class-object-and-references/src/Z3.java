class Z3 
{
	public static void main(String[] args) 
	{
		Book obj = new Book();
		obj.pages = 10;
		System.out.println("main1:" + obj.pages);
		Test.f1(obj);
		System.out.println("main2:" + obj.pages);
	}
}
