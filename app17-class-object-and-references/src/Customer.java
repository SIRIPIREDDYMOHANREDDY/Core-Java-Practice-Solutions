class Customer 
{
	String name;
	int age;

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.name = "Ramu";
		c1.age = 22;

		Customer c2 = new Customer();
		c2.name = "Murali";
		c2.age = 21;

		Customer c3 = new Customer();
		c3.name = "Swetha";
		c3.age = 20;

		System.out.println(c1.name + ", " + c1.age);
		System.out.println(c2.name + ", " + c2.age);
		System.out.println(c3.name + ", " + c3.age);
	}
}
