class R 
{
	int i;
	int j;
	public static void main(String[] args) 
	{
		R r1 = new R();
		r1.i = 10;
		r1.j = 20;
		R r2 = r1;
		System.out.println(r1.i + ", " + r1.j);
		System.out.println(r2.i + ", " + r2.j);
		r2.i = 200;
		r2.j = 600;
		System.out.println(r1.i + ", " + r1.j);
		System.out.println(r2.i + ", " + r2.j);
	}
}
