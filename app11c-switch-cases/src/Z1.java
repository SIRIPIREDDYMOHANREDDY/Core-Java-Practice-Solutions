class Z1 
{
	enum Day {MON, TUES, WED, THR, FRI, SAT, SUN};
	public static void main(String[] args) 
	{
		Day d1 = Day.MON;
		switch(d1)
		{
			case WED:
				System.out.println("in WED");
			    break;
			case MON:
				System.out.println("in MON");
			    break;
		}
	}
}
