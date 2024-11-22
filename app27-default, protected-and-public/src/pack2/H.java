package pack2;
import pack1.*;  // * means import every public member from pack1 to pack2
class  H extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//System.out.println(a1.p);
		//System.out.println(a1.q);  //even though q is protected member we get error because q is using with a1. so it comes under usage not under inheritance
		System.out.println(a1.r);

		H h1 = new H();
		//System.out.println(h1.p);
		System.out.println(h1.q);
		System.out.println(h1.r);
	}
}
