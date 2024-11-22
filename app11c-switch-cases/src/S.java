class S 
{
	enum Day {MON, TUES, WED, THR, FRI, SAT, SUN};
	public static void main(String[] args) 
	{
		Day d1 = Day.MON;
		System.out.println(d1);
		System.out.println(d1.ordinal());
		Day d2 = Day.FRI;
		System.out.println(d2);
		System.out.println(d2.ordinal());
		Day d3 = Day.WED;
		System.out.println(d3);
		System.out.println(d3.ordinal());

	}
}

/*
    Switch Case Allowed Arguments
	    byte
		short
		char
		int
		String
		enum Constant

*/