class  A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("do-while body begin:" + i);
			System.out.println("do-while body end:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main begin");
		System.out.println("main end");
	}
}




/*
do while loop
do while loop can be used in case when we have to execute the body of the loop
minimum once irrespective of the boolean condition result.
Here also like while loop there is specific or fixed location for boolean condition,
and there is no fixed location for initialization of the variable, or changes for the
next iteration purpose.
Do while should end with a semicolon. it is the part of the syntax.
In do while loop whichever variable we are using in boolean condition it should
not be local to the body.
It should be declared before do keyword. In case of dowhile boolean condition
not executing for first iteration.
Internal flow of execution for while loop and for loop is same, there may be
changes in fixed location for initialization and next iteration but we can achieve
same executions using for and while loop.
but in case of doWhile loop , it is not checking the boolean condition for the first
iteration, and we cannot have variable used in the loop to be local to the loop.

*/
