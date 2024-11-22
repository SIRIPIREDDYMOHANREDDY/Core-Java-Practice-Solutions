class O 
{
	int i;
	int j;

	O(int i, int j)
	{
		this.i = i;
		this.j = j;    // here i , j  are both  names in local and global 
	}
	public static void main(String[] args) 
	{
		O o1 = new O(90, 30);
		O o2 = new O(910, 130);
		System.out.println(o1.i + ", " + o1.j);
		System.out.println(o2.i + ", " + o2.j);
	}
}
