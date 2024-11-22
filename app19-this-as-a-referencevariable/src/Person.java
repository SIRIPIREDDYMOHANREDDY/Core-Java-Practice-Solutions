class Person 
{
	String name;
	int age;
	String address;

	Person (String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public static void main(String[] args) 
	{
		Person p1 = new Person("Mohan", 22, "BTM");
		Person p2 = new Person("Ramu", 24, "JP Nagar");
		Person p3 = new Person("Swetha", 23, "JAYA Nagar");
		System.out.println(p1.name + ", " + p1.age + ", " + p1.address);
		System.out.println(p2.name + ", " + p2.age + ", " + p2.address);
		System.out.println(p3.name + ", " + p3.age + ", " + p3.address);
	}
}
// any classes for logical entity  constructor inorder to inlinilize  utomatically