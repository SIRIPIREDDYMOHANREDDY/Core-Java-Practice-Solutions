class B 
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}

	{
		System.out.println("IIB");  //  instance initilization block
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("--------------");
		B b2 = new B(20);
	    System.out.println("--------------");
		B b3 = new B();
		System.out.println("--------------");
		B b4 = new B(120);
	    System.out.println("--------------");
	}
}
// no matter which constructor you are using to create a  object
// for very object  iib will execute   automatically  first iib output and ofter constructor output