class Z3 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		switch (i)
		{
		    case 5:
				System.out.println("case 5");
                break;
		    case j:  //j is final. So it is a constant value
				System.out.println("case 10");
                break;
		}	
	}
}


/*
case value cannot be assigned to a variable , how ever if we declare a variable as
final we can use in case value.
Note : final value should at the time of declaration itself. if we are mentioning a
variable as final and initializing in the next statement then even though it is
legitimate for final as we are assigning a value only one time it cannot be used as
switch case value .

*/