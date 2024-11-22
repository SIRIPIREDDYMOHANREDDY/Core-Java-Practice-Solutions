class L 
{
	int i;
	int j;

    L()
	{
		i = 10;           //this.i = 10
		j = 20;           //this.j = 20
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
}

// object members cam initilize constructor body