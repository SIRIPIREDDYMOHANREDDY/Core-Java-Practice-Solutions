class L 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(L.i);
		L obj = new L();
		System.out.println(obj.i);     //System.out.println(L.i);
	}
}
// there is possibility to with refference  to call static