class M 
{
	int i;  // global
	M(int i)  // i is argument to the constructor it is local to the constructor  
	{
		this.i = i;  // right hand local
 	}                // left hand global
	public static void main(String[] args) 
	{
		M m1 = new M(10);
		M m2 = new M(20);
		M m3 = new M(30);
		System.out.println(m1.i);
		System.out.println(m2.i);
		System.out.println(m3.i);
	}
}
//  both are different we wont menction this 