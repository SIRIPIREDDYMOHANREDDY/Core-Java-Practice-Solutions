class  A
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (false)
		{
			System.out.println(2);
		}
		else 
        {
			System.out.println(3);
        }
		System.out.println(2);
	}
}


/*
Execution of else block depends on the condition of the if statement. else block
executes only when if() returns false.

*/


/*

Some important observations with respect to else block
1. Any number of statements can be developed inside else block.
2. Any type of statements can be developed inside else block.
3. else cannot be developed independently. It should be followed by if
condition.
4. No statements can be developed between if block and else block.
5. Multiple else cannot be developed for one if statement ,one if should
follow only one else block.

*/
