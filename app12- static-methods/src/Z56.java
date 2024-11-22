class Z56 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++ + i); //test1(1 + 2)  = test1(3)                                i = 2
		j += test2(i-- + i);//j = 7 + test2(2 + 1) = 7 + test2(3) = 7 + 8 = 15            i = 1,j = 15
		j += test3(++i + i);//j = 11 + test3(2 + 2) = 15 + test3(4) = 15 + 7 = 22         i = 2,j = 22
		j += test4(--i + i);//j = 18 + test4(1 + 1) = 22 + test4(2) = 22 + 8 = 27         i = 1, j = 27
		System.out.println("main:" + i + ", " + j);// i =1 , j = 30
	}
	public static int test1(int i)
	{
		System.out.println("test1:" + i);//i = 3
		return i++ + i;// return 3 + 4 = 7
	}
	public static int test2(int i)
	{
		System.out.println("test2:" + i);//i = 3
		return ++i + i; // return 4 + 4 = 8
	}
	public static int test3(int i)
	{
		System.out.println("test3:" + i);//i = 4
		return i-- + i;// return 4 + 3 = 7
	}
	public static int test4(int i)
	{
		System.out.println("test4:" + i);//i = 2
		return --i + i++ + i-- + ++i + i;//return 1 + 1 + 2 + 2 + 2 = 8
	}
	
}
