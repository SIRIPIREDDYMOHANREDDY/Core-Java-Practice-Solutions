class V 
{
	public static void main(String[] args) 
	{
		Product obj1 = new Product();
		obj1.name = "Tv";
        obj1.price = 40000;

		Product obj2 = new Product();
		obj2.name = "Mobile";
        obj2.price = 20000;

		Product obj3 = new Product();
		obj3.name = "laptop";
        obj3.price = 50000;

		System.out.println(obj1.name + ", " + obj1.price);
		System.out.println(obj2.name + ", " + obj2.price);
		System.out.println(obj3.name + ", " + obj3.price);
	}
}
// designing a class for logical entity is nothing but encapsulation
//Encapsulation:
//Encapsulating or grouping relevant members of logical entity like Person, Student,
//Country, Company etc is known as encapsulation.
//class is used for representing property and behavior of logical entity.
// class encapsulates properties and behavior of physical entitity.
//For one logical entity one class is developed and multiple physical entity means
//objects are developed which may are may not have same properties.