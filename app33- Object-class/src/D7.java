class A 
{
	int i;
	int j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()  // toString method already available in Object class here we are override the toString method. So we get the content of the object instead of reference.
	{
		String data = "i = " + i + ", j = " + j;
		return data;
	}
}
class  D7
{
	public static void main(String[] args) 
	{
		A a1 = new A(90, 30);
		System.out.println(a1); // here we are calling reference varible but we get the content of reference variable instead of reference
	}
}
