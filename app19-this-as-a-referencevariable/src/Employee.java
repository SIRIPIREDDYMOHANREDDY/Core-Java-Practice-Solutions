class Employee
{
	private String name;
	private int age;
	private double salary;
	private int experience;

	public double codingFast()
	{
		// calculate by making use of age, experience and salary
		return 1.0;
	}

	public void setName(String name)
	{    
		//security check
		this.name = name;
	}

	public String getName()
	{   
		//security check
		return name;
	}

	public void setAge(int age)
	{
		//security check
		this.age = age;
	}

	public int getAge()
	{
		//security check
		return age;
	}

	public void setSalary(double salary)
	{
		//security check
		this.salary = salary;
	}

	public double getSalary()
	{
		//security check
		return salary;
	}

}
class Manager 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setName("Mohan");
		e1.setSalary(344455.898);
		e1.setAge(29);
		double coding = e1.codingFast();
		System.out.println("Name:" + e1.getName());
		System.out.println("Salary:" + e1.getSalary());
		System.out.println("Age:" + e1.getAge());
		System.out.println("Coding Rate:" + coding);
	}
}
