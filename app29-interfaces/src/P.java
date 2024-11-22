class A
{
}
interface B
{
}
class  P extends A implements B  // same class can extends and implements but order should be 1st extends then it should be implements
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
