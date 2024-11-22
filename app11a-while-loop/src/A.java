class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
			System.out.println("body:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}

/*
while loop :
while loop syntax is very simple. it has only specific fixed location for boolean
condition purpose, we have to initialize the variables before the loop itself. for
changes in every iteration there is no fixed location purpose we can do changes
anywhere in the body. As long as boolean condition is resulting true control will
be iterating again and again till boolean condition results false.

*/
