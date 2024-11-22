class J 
{
	static int count;
	
	J()
	{
		//some statements
		count++;
	}

	J(int j)
	{
		//some statements
		count++;
	}

    J(double i)
	{
		//some statements
		count++;
	}

	public static void main(String[] args) 
	{
		J j1 = new J();
		J j2 = new J();
		J j3 = new J(10);
		J j4 = new J();
		J j5 = new J(2.9);
		J j6 = new J();
		J j7 = new J(12);
		System.out.println(count);
	}
}
