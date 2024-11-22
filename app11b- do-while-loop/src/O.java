class O
{
	public static void main(String[] args) 
	{
		String[] names = {"Mohan", "Murali", "Swetha", "Sunitha", "Ravi"};
		String name;
		for(name : names)  // error - it won't allow declared variables to use inside for-each loop
		{
			System.out.println(name);
		}
	}
}
