interface A
{
}
interface B
{
}
interface C
{
}
class D
{
}
class  Q extends D implements A, B, C      //super class can be maximum only 1 and implements any no.of interfaces by using ',' as separater
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
