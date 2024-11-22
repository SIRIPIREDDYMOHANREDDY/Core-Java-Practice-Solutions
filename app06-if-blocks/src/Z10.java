class Z10
{
	public static void main(String[] args) 
	{
		 int i = 10;
	   {
		   System.out.println("inside a block:" + i);
		   i = 30;
    	}
		System.out.println("after a block:" + i);
		{
		   System.out.println("inside a 2nd block:" + i);
		   i += 40;
		}
			System.out.println("at block:" + i);
	}
}
