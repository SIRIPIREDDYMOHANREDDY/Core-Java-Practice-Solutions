class A  //class A is super class. Every member of super class inheritant to subclass
{
	int i;
}

class B extends A // class B is sub class
{                 // so class B contains i and j
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
// BOTH ARE NON PUBLIC WE CAN SAVE ANY NAME