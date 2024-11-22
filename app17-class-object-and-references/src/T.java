class T 
{
	int i;

	public static void main(String[] args) 
	{
		T t1 = new T();
		T t2 = new T();
		T t3 = new T();
		T t4 = new T();
		System.out.println(t1.i + ", " + t2.i + ", " + t3.i + ", " + t4.i);
		t1.i = 10;
		System.out.println(t1.i + ", " + t2.i + ", " + t3.i + ", " + t4.i);
		t2.i = 20;
		System.out.println(t1.i + ", " + t2.i + ", " + t3.i + ", " + t4.i);
		t3.i = 30;
		System.out.println(t1.i + ", " + t2.i + ", " + t3.i + ", " + t4.i);
		t4.i = 40;
		System.out.println(t1.i + ", " + t2.i + ", " + t3.i + ", " + t4.i);
	}
}
