package pack2;
class  E
{
	public static void main(String[] args) 
	{
		A a1 = new A();  // error -we can't import one package into another package directly
		System.out.println(a1.p);
		System.out.println(a1.q);
		System.out.println(a1.r);
	}
}
