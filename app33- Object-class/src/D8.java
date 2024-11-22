class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "name = " + name + ", age = " + age;
	}
}
class  D8
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Mohan",22);
		Person p2 = new Person("Ravi",23);
		Person p3 = new Person("Swetha",21);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
