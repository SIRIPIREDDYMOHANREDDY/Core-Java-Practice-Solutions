class N 
{
	int i;
	
	N(int p)
	{
		i = p;     // this.i=p;     
	}
	public static void main(String[] args) 
	{
		N n1 = new N(10);
		System.out.println(n1.i);
		N n2 = new N(20);
		System.out.println(n2.i);
		N n3 = new N(30);
		System.out.println(n3.i);
	}
}
