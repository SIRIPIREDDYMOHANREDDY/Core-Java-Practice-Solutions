class Z2
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 1;
		if (++i == i++ && ++i == i++)
		//   2  ==  2       4 ==  4 
		{
            System.out.println(2);
			System.out.println("inside if block:" + i);
			i += 5;    // i = i + 5;
		}
		System.out.println(3);
		System.out.println("after if block:" + i);
	}
}
