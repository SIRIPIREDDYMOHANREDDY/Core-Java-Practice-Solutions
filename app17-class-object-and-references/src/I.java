class I 
{
	int p;
	double q;
	public static void main(String[] args) 
	{
		I obj = new I();
        System.out.println(obj.p);
		System.out.println(obj.q);
		obj.p = 10;
		obj.q = 30;
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
}
//  two non static members 
// non static members also called object members
