class  H
{
	int i;

    void test()
	{
		System.out.println("test:" + i);   // this.i
		i += 10;
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.i = 20;
		System.out.println("main1:" + h1.i);
		h1.test();
		System.out.println("main2:" + h1.i);
	}
}
// in very non static variable this is avaible as a refference variable
// compiler only provide this we wont menction directly