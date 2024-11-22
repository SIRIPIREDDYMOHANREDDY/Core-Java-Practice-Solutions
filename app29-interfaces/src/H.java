interface A
{
	int p = 10;//by default it is final.
}
class  H
{
	public static void main(String[] args) 
	{
		System.out.println(A.p);
		//A.p = 20; --> it is constant we can't change.
		System.out.println(A.p);
	}
}
