class Person 
{
	String name;
	int age;
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.name = "Mohan";
		p1.age = 22;

		p2.name = "Swetha";
		p2.age = 23;

		p3.name = "Krishna";
		p3.age = 21;

		System.out.println(p1.name + ", " + p1.age);
		System.out.println(p2.name + ", " + p2.age);
		System.out.println(p3.name + ", " + p3.age);
	}
}
