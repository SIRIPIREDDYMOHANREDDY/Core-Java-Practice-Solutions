class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if (true)
		{
		   System.out.println(2);
		   if (true)
		   {
			  System.out.println(3);
		   }
		   	  System.out.println(4);
		}
			 System.out.println(5);
	}
}

/*

Nested-if-blocks
Developing one if block inside another if block is called Nested-if blocks.
As outer if block results true, controls goes inside inner if block and all sop is
printed.
Outer if block results false irrespective of inner if block result inner if block will
not be executed.

*/