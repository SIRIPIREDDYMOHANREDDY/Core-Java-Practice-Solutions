class T 
{
	T()
	{
	}
	void test() 
	{
		this();
	}
}	
// explicit constructor invocation may only appear within a constructor body
// this() calling statement only for constructors not for methods