class M 
{
	int i;
	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.i = 10;
		System.out.println("main1:" + m1.i);
		m1.i = 30;
		System.out.println("main1:" + m1.i);
		m1 = null;
		m1.i = 30;
		System.out.println("main1" + m1.i);
	}
}
