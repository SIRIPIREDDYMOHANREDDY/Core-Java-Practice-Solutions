class A
{
	int i;

	public String toString()  // toString method already available in Object class here we are override the toString method. So we get the content of the object instead of reference.
	{
		return "i = " + i;
	}
}
class  D6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 400;

		System.out.println(a1); // here we are calling reference varible but we get the content of reference variable instead of reference.
	}
}
