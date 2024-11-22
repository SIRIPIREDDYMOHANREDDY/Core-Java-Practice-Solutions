class Y // cyclic not allowed in this(); calling statement
{
	Y()
	{
		this(90);
	}
	Y(int i)
	{
		this();  
	}
}
