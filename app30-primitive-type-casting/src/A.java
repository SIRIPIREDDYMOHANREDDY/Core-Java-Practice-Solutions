class  A
{
	public static void main(String[] args) 
	{
		System.out.println(Byte.MIN_VALUE);//byte can convert automatically into short, int, long, float, double is called auto widening
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);//short can convert automatically into int, long, float, double is called auto widening
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);//integer can convert automatically into long, float, double is called auto widening
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);//long can convert automatically into float, double is called auto widening
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);//float can convert automatically into double is called auto widening
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
}




/*
      byte
	  short
	  int 
	  long
	  float
	  double


      byte < short < int < long < float < double
*/