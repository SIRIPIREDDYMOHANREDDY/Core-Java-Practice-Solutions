class J 
{
	J()
	{
		System.out.println("from constructor: " + this);
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("from main:" + j1);
	}
}
